class Array_Study_03 
{
	public static void main(String[] args) 
	{
		int ballArr[]={1,2,3,4,5,6,7,8,9};	//index
		int ball3[]=new int[3];	//초기값X
		int temp=0;

		for (int x=1; x<=100; x++){
//			System.out.println(x);
			int i=(int)(Math.random()*ballArr.length);	//0~8
			int j=(int)(Math.random()*ballArr.length);
//			System.out.println(i+" "+j);

			temp=ballArr[i];
			ballArr[i]=ballArr[j];
			ballArr[j]=temp;
		}

//		for (int i=0; i<ballArr.length; i++){
//			System.out.print(ballArr[i]+"\n");
//		}

		//방법1
//		ball3[0]=ballArr[0];
//		ball3[1]=ballArr[1];
//		ball3[2]=ballArr[2];

		//방법2
//		for (int i=0; i<ball3.length; i++){	//i=0,1,2
//			ball3[i]=ballArr[i];
//		}

		//방법3
		System.arraycopy(ballArr,0,ball3,0,3);

		for (int i=0; i<ball3.length; i++){
			System.out.println(ball3[i]);
		}
	}
}
