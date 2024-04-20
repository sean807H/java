class Exam_06
{
	public static void main(String[] args) 
	{
		boolean a = true, b = false, c;
//		c = a | b;
//		System.out.println(c);

//		c = a & b;
//		System.out.println(c);

		System.out.println("-----------------------------");

		c = aa() | bb();	//c = aa() || bb() 는 bb함수 호출 안함
		System.out.println(c);
		
		c = bb() & aa();	//c = bb() || aa() 는 aa함수 호출 안함
		System.out.println(c);

		System.out.println("-----------------------------");

	} //main

	public static boolean aa() {
		System.out.println("aa() 함수 호출");
		return true;
	}
	
	public static boolean bb() {
		System.out.println("bb() 함수 호출");
		return false;
	}

} //Exam_06
