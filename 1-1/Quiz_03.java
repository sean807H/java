import java.util.Scanner;

class Quiz_03 
{
	public static void main(String[] args)                                                                           
	{
		// 소문자, 숫자는 그대로 출력
		// 대문자만 소문자로 변환하여 출력
		// a->a, 1->1 A->a
		
		Scanner sc = new Scanner(System.in, "EUCKR");
		String input;
		System.out.print("영문자나 숫자를 입력하세요 : ");
		input = sc.next(); //Int,Byte 등등 입력가능
//		System.out.println(input);
		char ch = input.charAt(0);
//		System.out.println(ch); //+1을 하면 숫자가 나옴

//		if(ch>='a'& ch<='z')
//		{
//			System.out.println(ch);
//		}
//		else if(ch>='A'& ch<='Z')
//		{
//			System.out.println((char)(ch+32));
//		}
//		else
//		{
//			System.out.println(ch);
//		}

		//teacher
//		if (ch>='A' & ch<='Z')
//		{
//			System.out.println("입력한 문자 : " + input + "변환된 문자 : " + (char)(ch+32));
//		}
//		else
//		{
//			System.our.println("입력한 문자 : " + input + "변환된 문자 : " + ch);
//		}

		//삼항연산자
		char c = (ch>='A' & ch<='Z') ? (char)(ch+32) : ch; //(boolean) ? true : false
		System.out.println(c);

	}
}
