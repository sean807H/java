import java.util.Random; //Random을 쓰기위해 import
import java.util.Scanner; //Scanner를 쓰기 위해 import

class Park_baseballs
{
	public static void main(String[] args) 
	{
		int com_hun, com_ten, com_one;
		int input; //입력받은 숫자저장
		int input_hun, input_ten, input_one;

		int st = 0, ball = 0, out = 0; //스트라이크, 볼, 아웃, 저장하는 변수
		int count = 1;				//횟수를 저장하기 위해 선언

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		com_hun = random.nextInt(10); // 0~9까지 무작위 숫자
		
		do
		{
			com_ten = random.nextInt(10); // 0~9까지 무작위 숫자
		}
		while (com_hun == com_ten); //조건문+반복문(같이 않을때까지 무조건 한번은 실행)
		//백의 자리와 십의 자리가 같으면 반복해서 새로운 숫자를 배정

		do
		{
			com_one = random.nextInt(10); // 0~9까지 무작위 숫자
		}
		while (com_hun == com_one || com_ten == com_one);
		//일의 자리가 백의 자리와 같거'나' 십의 자리와 같으면 계속해서 새로운 숫자를 배정
		System.out.println(com_hun + " " + com_ten + " " + com_one);
		
		while(true)
		{
		System.out.print("\n3자리 숫자를 입력해 주세요 : ");
		input = sc.nextInt();
//		System.out.println("입력된 숫자는 " + input + "입니다.");
		if(input<=0 || input>=1000)
			continue;

		input_hun = input / 100;		//백의 자리를 저장하는 식(나누는 식)
		input_ten = (input % 100) / 10; //십의 자리를 저장하는 식
		input_one = input % 10;		//일의 자리를 저장하는 식

		System.out.println("입력된 숫자는 " + input_hun + input_ten + input_one + "입니다.");

		if((input_hun == input_ten) || (input_hun == input_ten) || (input_hun == input_one))
			{
				System.out.println("중복된 숫자가 있습니다.");
			}
		
		if (input_hun == com_hun)
			st++;				//백의 자리가 같으면 스트라이크 증가
		else if (input_ten == com_hun || input_one == com_hun)
			ball++;
		else
			out++;
		
		if (input_ten == com_ten)
			st++;				//십의 자리가 같으면 스트라이크 증가
		else if (input_hun == com_ten || input_one == com_ten)
			ball++;
		else
			out++;

		if (input_one == com_one)
			st++;				//일의 자리가 같으면 스트라이크 증가
		else if (input_hun == com_one || input_ten == com_one)
			ball++;
		else
			out++;

		System.out.println(count + "번째, 스트라이크 : "+st+", 볼 : "+ball+", 아웃 : "+out+"\n");

		if(st == 3 || count == 10) //게임이 끝나는 조건, 스트라이크가 3일 때
			{
				break;
			}

		st = 0;
		ball = 0;
		out =0;
		count++; //루프가 반복될 때 count 변수 증가
		
		}
		
		System.out.println("축하합니다."+count+"번 만에 숫자를 맞추셨습니다!");

	}
}
