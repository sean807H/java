import java.util.Random;
import java.util.StringTokenizer;

public class test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceNum;
		Random random = new Random();

		String text = "짱구,맹구,철수,유리,훈이,흰둥이";
        StringTokenizer st = new StringTokenizer(text,",");
        while(st.hasMoreTokens()){
            String playerName = st.nextToken();
            diceNum = random.nextInt(7);
            System.out.println(playerName+" : " + diceNum);
        }
	}

}
