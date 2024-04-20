class Exam_02 
{
	public static void main(String[] args) 
	{
//		char ch = 'A'; //작은따옴표, 단일문자
		int code = 65; //자동형변환(묵시적형변환)
		char ch = (char)code;
		System.out.println(code);
		System.out.println(ch);
		System.out.println((char)(ch+1)); //대문자 B출력

//		char ch = '\u0041'; //16진수
//		아스키코드 0=48,A=65,a=97
	}
}
