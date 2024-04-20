	class Exam_04 
{
	public static void main(String[] args) 
	{
//		char ch = 'A';
//		int code = ch + 1; //뎃셈 65+1
//		System.out.println((char)(code));

//		char ch1 = 'A';
//		char ch2 = 'B';
//		int code = ch1 + ch2;
//		System.out.println(code); //131

//		char ch1 = 'A';
//		char ch2 = 'Z';
//		for(int i=ch1; i<=ch2; i++) {	//65~90
//			System.out.println(i);	//char로 강제형변환을 하면 A~Z
//			System.out.println(i+" "+(char)i);
//			System.out.println(); //띄어쓰기
//		}

		char ch1 = 'A';
		char ch2 = 'Z';
		for(int i=ch2; i>=ch1; i--){
			for(int j=ch1; j<=i; j++){
				System.out.print((char)j); //나중에는 "*" 찍기
			}
			System.out.println();
		}
	}
}
