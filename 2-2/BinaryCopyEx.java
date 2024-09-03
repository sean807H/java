package two_2;

import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File(".//src//two_2//dk.png");
		File dest = new File("c:\\Temp\\copyimg.png");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close(); fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
