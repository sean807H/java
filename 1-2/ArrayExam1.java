class ArrayExam1 
{
	public static void main(String[] args) 
	{
		// 1. 배열선언
//		int a[];

//		// 2. 배열생성
//		a = new int[3];

//		// 3. 배열초기화
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;

//		System.out.println(a.length);

		// 1단계 : 선언&생성
//		int a[] = new int[3];

		// 2단계: 초기화
//		a[0] = 23;
//		a[1] = 24;
//		a[2] = 25;

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

		// 1. 선언&생성&초기화
		int a[] = new int[]{23,24,25};
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
