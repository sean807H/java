import java.util.Scanner;	
class BaseBallGame 
{
	public static void main(String[] args) 
	{
		int c1,c2,c3;
		int h1,h2,h3;
		int s=0,b=0;
		int count=0;

		Scanner sc = new Scanner(System.in,"EUCKR");

		c1 = (int)(Math.random()*9)+1; //1~9사이의 임의의 수를 생성

		do
		{
			c2 = (int)(Math.random()*9)+1;
		}
		while (c2==c1); //false가 될때까지 무한반복(다른 숫자)

		do
		{
			c3 = (int)(Math.random()*9)+1;
		}
		while (c3==c2 || c3==c1);
		System.out.println(c1+" "+c2+" "+c3);

		while (true)
		{
			count++;
			if(s==3) break;

			s=0;
			b=0; //값 초기화

			System.out.print("1~9 사이의 숫자 3개 입력(ex 1 2 3) : ");
			h1=sc.nextInt();
			h2=sc.nextInt();
			h3=sc.nextInt();

			if(h1==c1) s++;
			else if(h1==c2||h1==c3) b++;

			if(h2==c2) s++;
			else if(h2==c1||h2==c3) b++;

			if(h3==c3) s++;
			else if(h3==c2||h3==c1) b++;

			System.out.println("["+s+"S"+b+"B]");
		}

		System.out.println("축하합니다."+count+"번 만에 숫자를 맞추셨습니다!");
	}
}
