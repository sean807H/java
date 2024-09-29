package two_2;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader(".\\src\\two_2\\Filetext.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c = fin.read())!= -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();   //버퍼에 남아있던 문자 모두 출력
			fin.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
