class SwitchExam4 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]); //"5"->5
//		System.out.println(a);
		
		switch(a)
		{
			case 1: System.out.println("31일");	break; //31일,30일끼리 합쳐도됨
			case 2: System.out.println("28일");	break;
			case 3: System.out.println("31일");	break;
			case 4: System.out.println("30일");	break;
			case 5: System.out.println("31일");	break;
			case 6: System.out.println("30일");	break;
			case 7: System.out.println("31일");	break;
			case 8: System.out.println("31일");	break;
			case 9: System.out.println("30일");	break;
			case 10: System.out.println("31일");	break;
			case 11: System.out.println("30일");	break;
			case 12: System.out.println("31일");	break;
			default: System.out.println("1~!2사이의 정수만 입력해주세요."); break;

			//book
			case 1 : case 3 :
			System.out.println("31일");
		}
	}
}
