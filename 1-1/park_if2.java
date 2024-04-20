import java.util.Scanner;

class park_if2 
{
	public static void main(String[] args) 
	{
		int ja; //자바 점수를 입력받을 변수
		Scanner sc = new Scanner(System.in);

		System.out.print("자바 점수를 입력하세요 : ");
		ja = sc.nextInt();

		System.out.print("입력한 자바 점수는 "+ja+"입니다.");

		if (ja >= 90)
		{
			System.out.print("당신의 자바 학점은 A입니다.");
		}
		else if (ja >= 80)
		{
			System.out.print("당신의 자바 학점은 B입니다.");
		}
		else if (ja >= 70)
		{
			System.out.print("당신의 자바 학점은 C입니다.");
		}
		else if (ja >= 60)
		{
			System.out.print("당신의 자바 학점은 D입니다.");
		}
		else if (ja >= 50)
		{
			System.out.print("당신의 자바 학점은 E입니다.");
		}
		else
		{
			System.out.print("당신의 자바 학점은 F입니다.");
		}
	}
}
