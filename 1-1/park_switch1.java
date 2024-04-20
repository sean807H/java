import java.util.Scanner;

class park_switch1 
{
	public static void main(String[] args) 
	{
		char rank;
		Scanner sc = new Scanner(System.in);

		System.out.print("자바 학점을 입력하세요 : ");
		rank = sc.next().charAt(0);
		System.out.println("입력후 자바 학점은 "+rank+"입니다.");

		switch(rank)
		{
			case 'A':
			case 'a':
				System.out.println("당신의 점수는 90점 이상입니다.");
			break;

			case 'B':
			case 'b':
				System.out.println("당신의 점수는 80점 이상입니다.");
			break;

			case 'C':
			case 'c':
				System.out.println("당신의 점수는 70점 이상입니다.");
			break;

			case 'D': // if ( rank == 'D' )
			case 'd':
				System.out.println("당신의 점수는 60점 이상입니다.");
			break;

			default : System.out.println("당신의 점수는 59점 이하입니다.");
		}
	}
}
