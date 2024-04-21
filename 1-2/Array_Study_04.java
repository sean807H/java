class Array_Study_04 
{
	public static void main(String[] args) 
	{
		// 이차원 배열
//		int table[][]=new int[3][4];
//		table[0][0]=10;
//		table[1][1]=20;
//		table[2][3]=table[0][0]+table[1][1];	//초기값이 0이라 가능

//		System.out.println(table[0][0]);
//		System.out.println(table[1][1]);
//		System.out.println(table[2][3]);
		
		int table[][]={{1,2},{3,4,5},{6,7,8,9}};

		for (int i=0; i<table.length; i++){	//3개
			for (int j=0; j<table[i].length; j++){
//				System.out.println(i+" "+j);
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
