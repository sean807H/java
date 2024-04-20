 import java.util.Scanner;

class IfExam1 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in); //"EUCKR" 한글 입력때 씀, 동적인 프로그램

		System.out.print("숫자를 입력하세요 : ");
		a=sc.nextInt();

//		if(a%2==0) {
//			System.out.println(a+"(은)는 짝수 입니다.");
//		}
//		else {
//			System.out.println(a+"(은)는 홀수 입니다.");
//		}

		//삼항연산자
//		String result = (a%2==0) ? "짝수" : "홀수";  //(boolean) ? true : false
//		System.out.println(a+"(은)는 "+result+" 입니다.");

//		System.out.println(a+"(은)는 "+(a%2==0) ? "짝수입니다." : "홀수입니다."));
	}
}
//exception 예외, 무시하고 지나감