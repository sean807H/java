import java.util.Random;	// Random을 쓰기 위해 import
import java.util.Scanner;	// Scanner를 쓰기 위해 import

class park_baseball 
{
	public static void main(String[] args) 
	{
		int com_hun, com_ten, com_one;
		int input;					// 입력받을 변수 선언
		int input_hun, input_ten, input_one;	// 입력하는 숫자를 쪼개서 저장할 변수

		int st = 0, ball = 0, out = 0;
		int count = 0;
		
		Random random = new Random();	// Random 선언
		Scanner sc = new Scanner(System.in);		// Scanner 선언

		com_hun = random.nextInt(10);		// 0~9까지 숫자 생성
		com_ten = random.nextInt(10);		// 0~9까지 숫자 생성
		com_one = random.nextInt(10);		// 0~9까지 숫자 생성
		// 0을 빼고 싶다면 (9) + 1
//		System.out.println(com);

		while( com_hun == com_ten ) {
			// 백의 자리와 십의 자리가 같으면 계속 반복	
			if( com_hun == com_ten )  {// 둘의 숫자가 같으면 새로운 숫자
				com_ten = random.nextInt(10);
			}
		}
		while( (com_hun == com_one) || (com_ten == com_one) ) {
		// 일의 자리가 백의 자리와 같거‘나’ 십의 자리와 같은 동안 무한 반복
			if(  (com_hun == com_one) || (com_ten == com_one)) {
			// 둘 중 하나라도 숫자가 같으면 새로 배정
				com_one = random.nextInt(10);
			}
		}

		System.out.println("생성된 숫자는 " + com_hun + com_ten + com_one + "입니다.\n");

		while(true)
		{

			System.out.print("3자리 숫자를 입력해 주세요 : ");
			input = sc.nextInt();

			input_hun = input / 100;		// 입력한 숫자를 100으로 나눈 몫을 저장
			input_ten = (input % 100) / 10;	// 입력한 숫자를 100으로 나눈 나머지를 10으로 나눈 몫을 저장
			input_one = input % 10;			// 입력한 숫자를 10으로 나눈 나머지를 저장

			
			System.out.println("입력된 숫자는 " + input + "입니다.");

			if (input_hun == com_hun)
				st++;
			else if ( (input_hun == com_ten) || (input_hun == com_one) )
				ball++;
			else
				out++;

			if (input_ten == com_ten)
				st++;
			else if ( (input_ten == com_hun) || (input_ten == com_one) )
				ball++;
			else
				out++;

			if (input_one == com_one)
				st++;
			else if ( (input_one == com_hun) || (input_one == com_ten) )
				ball++;
			else
				out++;

			System.out.println("스트라이크 : " + st + ", 볼 = " + ball + ", 아웃 : " + out + "\n");

			count++;
			if ( st == 3)
			{
				break;
			}
			st = 0;
			ball = 0;
			out = 0;
			
		}

		System.out.println("\n축하합니다. 숫자를 맞췄습니다. " + count + "번 만에 맞췄습니다.");

	}


}
