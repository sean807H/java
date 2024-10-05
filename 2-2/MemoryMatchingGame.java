import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class MemoryMatchingGameWithBackImage extends JFrame {
    private JButton[] buttons;
    private ImageIcon[] cardImages;
    private ImageIcon backImage;  // 카드 뒷면 이미지
    private boolean firstCardFlipped = false;
    private int firstCardIndex = -1;

    public MemoryMatchingGameWithBackImage() {
        setTitle("Memory Matching Game");
        setSize(300, 300);  // 크기는 3x2 그리드에 맞게 조정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));  // 2행 3열의 그리드 레이아웃 설정

        // 이미지 로드 (카드 값 대신 이미지 아이콘 사용)
        cardImages = new ImageIcon[6];
        backImage = new ImageIcon("back.png");  // 뒷면 이미지 로드
        loadCardImages();  // 이미지를 로드하는 메소드

        buttons = new JButton[6];

        // 카드 버튼 추가
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            buttons[i].setFocusPainted(false);
            buttons[i].setIcon(backImage);  // 초기에는 모두 뒷면 이미지 설정
            final int index = i;

            // 카드 클릭 시 행동 처리
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onCardClicked(index);
                }
            });

            add(buttons[i]);
        }

        setVisible(true);
    }

    private void loadCardImages() {
        // 이미지를 로드하고 두 번씩 배열에 넣음 (쌍으로 사용하기 위해)
        ArrayList<ImageIcon> images = new ArrayList<>();

        // 각각의 이미지를 두 번씩 추가하여 쌍을 만듦
        images.add(new ImageIcon("dk.png"));
        images.add(new ImageIcon("dk.png"));
        images.add(new ImageIcon("dino.png"));
        images.add(new ImageIcon("dino.png"));
        images.add(new ImageIcon("wonwoo.png"));
        images.add(new ImageIcon("wonwoo.png"));

        // 이미지 섞기
        Collections.shuffle(images);

        // 섞은 이미지를 cardImages 배열에 할당
        for (int i = 0; i < 6; i++) {
            cardImages[i] = images.get(i);
        }
    }

    private void onCardClicked(int index) {
        if (buttons[index].getIcon() == backImage) {  // 카드가 뒷면일 경우
            buttons[index].setIcon(cardImages[index]);  // 앞면 이미지 보여줌

            if (!firstCardFlipped) {
                firstCardFlipped = true;
                firstCardIndex = index;
            } else {
                checkForMatch(index);
                firstCardFlipped = false;
            }
        }
    }

    private void checkForMatch(int secondCardIndex) {
        if (cardImages[firstCardIndex].getDescription().equals(cardImages[secondCardIndex].getDescription())) {
            // 맞춘 경우
            buttons[firstCardIndex].setEnabled(false);
            buttons[secondCardIndex].setEnabled(false);
        } else {
            // 틀린 경우 1초 대기 후 뒤집기
            Timer timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    buttons[firstCardIndex].setIcon(backImage);  // 뒷면으로 다시 전환
                    buttons[secondCardIndex].setIcon(backImage);  // 뒷면으로 다시 전환
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    public static void main(String[] args) {
        new MemoryMatchingGameWithBackImage();
    }
}
