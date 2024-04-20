import java.util.Scanner; //Scanner 사용하기 위해 import 시킴

class park_if1 
{
	public static void main(String[] args) 
	{
		char input;
		Scanner sc = new Scanner(System.in); //스캐너 선언
		
		System.out.print("Y/N : ");
		input = sc.next().charAt(0); //문자하나만 입력받음
		//System.out.println(input);
		
		System.out.print("박원 선생님은 잘생겼나요? y/n : ");
		input = sc.next().charAt(0);

		if(input == 'y' || input == 'Y')
		{
			System.out.println("박원 선생님은 잘생겼군요!");
		}
		else if(input == 'n' || input == 'N')
		{
			System.out.println("ㅡㅡ");
		}
		else
		{
			System.out.println("잘못된 대답입니다.");
		}
	}
}
