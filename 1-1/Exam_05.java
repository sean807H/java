class Exam_05 
{
	public static void main(String[] args) 
	{
//		short a;
//		a=10;
//		a=15;	//변수
//		short b=0,c=(20+5)*2;//변수선언초기화
//		System.out.println("연산자 우선 순위 : " + c);
//		System.out.println(b+1);
//		System.out.println(str);

//		byte ba;
//		ba =(byte)132; //강제형변환
//		System.out.println("ba= " + ba);

//		char ch = 'a';
//		System.out.println((char)(ch+1));
//		System.out.println("a는 " + (int)ch);

//		int su = 97;
//		System.out.println(su); //(char)=소문자 a가 나옴
//		System.out.println("97는(은) " + (char)su);

//		int yy=97;
//		System.out.println((char)yy);
//		System.out.println((int)'a');
//		boolean zz=false; // true
//		System.out.println(zz);

//		int ive = 100;	//정수의 기본형의 int
//		long la = 100L; //자동형변환 'L'
//		float fa = (float)5.3f; //강제형변환 및 숫자뒤에 'f'
//		double da = 5.3;	//실수의 기본형은 double

//		int ic = (int)5.8; //강제형변환으로 소수점이하가 잘림(손실가능성)
//		System.out.println(ic);

//		double db = 4.5 + (double)5; //자동형변환은 손실가능성이 없음
//		System.out.println(db); ==9.5

//		int id = 1; //증감연산자 : a=a+1, a+=1, a++, ++a
//		System.out.println("id = " + id);
//		int ie = ++id; //++이 앞에 붙으면 앞의 값이 달라짐
//		System.out.println("id = " + ie + ",id = " + id);

//		int ih = 10/3; //소수 : double ih = 10.0/3
//		int ii = 10%3;
//
//		System.out.println("ih = " +ih);
//		System.out.println("ii = " +ii);

//		int ij, ik;
//		ij=8;
//		ik=ij>>2; //>>비트이동 8/4=2
//		System.out.println("ik = " + ik);
//		System.out.println("ij = " + ij);
//
//		ik = ij >>> 2;
//		System.out.println("ik = " + ik); //왼쪽 무조건 0으로 채움

//		//삼항연산자
//		int m=10, n;
//		n = ((m==5) || (m>=7)) ? ++m : 200;
//		System.out.println("n= " + n);

		int m=10, n;
		if((m==5) || (m>=7)){
			n= ++m;
		}
		else{
			n=200;
		}
		System.out.println("n= " + n); //같은 문장은 한 번만 써!
	}
}