class SwitchExam3 
{
	public static void main(String[] args) 
	{
		int a=8;
		switch(a%3) {
			case 0: System.out.println(a+"은 3의 배수입니다."); break;
			case 1:
			case 2: System.out.println(a+"은 3의 배수가 아닙니다."); break;
//			default: System.out.println("결과값이 이상합니다"); break;
		}
	}
}
