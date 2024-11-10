package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class ImageButtonDemo2 extends JFrame {
    private JPanel buttonPanel;
    private JLabel imageLabel;
    private JPanel imagePanel; // 중앙에 이미지 추가할 패널
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;

    public ImageButtonDemo2() {
        setTitle("Simple Image Button Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(new BorderLayout());

        // Setup panels
        buttonPanel = new JPanel();
        imagePanel = new JPanel(new GridBagLayout()); // 이미지 센터링할 패널
        imageLabel = new JLabel();
        
        // 이미지 패널에 레이블 추가
        imagePanel.add(imageLabel, new GridBagConstraints());

        add(buttonPanel, BorderLayout.NORTH);
        add(imagePanel, BorderLayout.CENTER);

        // Create buttons
        JButton button1 = new JButton("Show Image 1");
        JButton button2 = new JButton("Show Image 2");

        // Add buttons to panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Button 1: Show img1.png
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeImage("img/img1.png", 300, 300);
            }
        });

        // Button 2: Show img2.png
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeImage("img/img2.png", 400, 400); // Adjust size if necessary
            }
        });

        setVisible(true);
    }

    // Method to change the current image
    private void changeImage(String path, int width, int height) {
        try {
            BufferedImage img = ImageIO.read(new File(path));
            Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resizedImage);
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
            imageLabel.setText("Error loading image");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageButtonDemo2();
            }
        });
    }
}
