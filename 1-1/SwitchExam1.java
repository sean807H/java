class SwitchExam1 
{
	public static void main(String[] args) 
	{
		int a=20, b=10;
		char op='*'; //op=42;
//		System.out.println((int)op);
//		+:42 -:45 *:42 /:47
		switch(op){	//정수
			case 43 : System.out.println(a+"+"+b+"="+(a+b)); break;
			case 45 : System.out.println(a+"-"+b+"="+(a-b)); break;
			case 42 : System.out.println(a+"*"+b+"="+(a*b)); break;
			case 47 : System.out.println(a+"/"+b+"="+(a/b)); break;
			default : System.out.println("사칙연산지만 입력해주세요.");
		}
	}
}
