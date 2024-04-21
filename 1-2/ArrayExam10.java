class ArrayExam10 
{
	public static void main(String[] args) 
	{
		// 이차원 배열
		// 1.선언
			int a[][];
//			int [][]a;
//			int []a[];

		// 2.배열
			a=new int[2][3];

		// 3.초기화
			a[0][0]=1;
			a[0][1]=2;
			a[0][2]=3;
			a[1][0]=10;
			a[1][1]=20;
			a[1][2]=30;

		// 1.선언&생성
			int a[][]=new int[2][3];

		// 초기화
			a[0][0]=1;
			a[0][1]=2;
			a[0][2]=3;
			a[1][0]=10;
			a[1][1]=20;
			a[1][2]=30;

		// 선언&생성&초기화
			int a[][]={ {1,2,3},{4,5,6} };
		
		// 선언&생성
		int a[][]=new int[2][3];

		// 초기화
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=30;
		
		// 선언&생성&초기화
		int a[][]={ {1,2,3}{10,20,30} }
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		for(int i=0; i<a.length; i++)	// i<2 X
		{
			for (int j=0; j<a[i].length; j++)	// j<i X
			{									//		1		2		3		10		20		30
				System.out.println(a[i][j]+"\t")	// a[0][0],a[0][1],a[0][2],a[1][0],a[1][1],a[1][2]
			}
			System.out.println();
//			System.out.println(i);	// i=0,1
		}
	}
}
