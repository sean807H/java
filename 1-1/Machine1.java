import java.util.Scanner;

class Machine1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in,"EUCKR");
		System.out.println("----------------------------------------------");
		System.out.println("1.콜라(600) 2.환타(550) 3.커피(370) 4.물(428)");
		System.out.println("----------------------------------------------");

		String choice;
		int money, menu, pay=0;
		int m1000=0, m500=0, m100=0, m10=0;

		String drink="", select="";
		System.out.println();
		System.out.print("돈을 넣어주세요 : ");
		money = sc.nextInt();
//		System.out.println(money + "원 넣으셨습니다");

		System.out.println();
		while(true) {

			System.out.print("음료수를 선택하세요(1~4): ");
			menu = sc.nextInt();

			switch(menu){ //정수,break,dafult
				case 1:
					select = "콜라"; //System.out.println("콜라선택");
					pay = 600;
					break;
				case 2:
					select = "환타";
					pay = 550;
					break;
				case 3:
					select = "커피";
					pay = 370;
					break;
				case 4:
					select = "물";
					pay = 420;
					break;
				default :
					System.out.println("메뉴를 다시 선택해주세요(1~4)");
					pay=0;
					select = "";
					break;
			} //switch

			if(money < pay) {
				System.out.println("잔액이 부족합니다.");
				System.exit(0); //바로 종료
			}
			else {
				drink = drink +select + " ";
				money -= pay;
				System.out.println("잔액은 "+money+"원 입니다.");
			}

			//System.out.println(select + "선택");
			drink = drink + select + " " ;

			System.out.print("추가로 선택하시겠습니까?(y|n) : ");
			choice = sc.next(); //문자니까 String으로 받음
			if(choice.equals("n") || choice.equals("N")) break; //==는 비교연산자 string은 못받기때문에 .equals+이그노어

		} //while
		System.out.println();
		System.out.println("****** 이용해 주셔서 감사합니다. ******");
		System.out.println();
		System.out.println("뽑으신 음료수는 " +drink+ "이며, 거스름 돈은"+money+"원 입니다.");

		m1000 = money / 1000;
		m500 = (money%1000) / 500;
		m100 = ((money%1000)%500) / 100;
		m10 = (((money%1000)%500)%100) / 10;

		System.out.println("자~ 거스름돈입니다.");
		System.out.println("1000원 "+m1000+"장, 500원 "+m500+"개, 100원"+m100+"개, 10원 "+m10+"개");

	} //main
} //Machine1
