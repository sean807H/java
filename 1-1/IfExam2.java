import java.util.Scanner;
class IfExam2 
{
	public static void main(String[] args) 
	{
		int a = 20, b= 10;
		String input;
//		String op;
//		System.out.println((int)'*');	*에대한 아스키코드
		Scanner sc = new Scanner(System.in); //"EUCKR" 한글 입력때 씀, 동적인 프로그램

		System.out.print("연산자 입력(+ - * /) : ");
//		op = sc.next();

//		if(op.equals('+'))
//			System.out.println(a+"+"+b+"="+(a+b));
//		else if(op.equals('-'))
//			System.out.println(a+"-"+b+"="+(a-b));
//		else if(op.equals('*'))
//			System.out.println(a+"*"+b+"="+(a*b));
//		else if(op.equals('/'))
//			System.out.println(a+"/"+b+"="+(a/b));

		input = sc.next();
		char op = input.charAt(0);
		
		if(op == ('+'))
			System.out.println(a+"+"+b+"="+(a+b));
		else if(op == ('-'))
			System.out.println(a+"-"+b+"="+(a-b));
		else if(op == ('*'))
			System.out.println(a+"*"+b+"="+(a*b));
		else if(op == ('/'))
			System.out.println(a+"/"+b+"="+(a/b));
	}
}
