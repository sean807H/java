class For_Study_01 
{
	public static void main(String[] args) 
	{
//		int a;	// 밖까지 영향을 미침
//		int sum=0;
//		for(a=1; a<=10; a++){
//			sum+=a; //sum=sum+a;	// a=1,2,3...10 초기화를 해야됨
//			System.out.println(a);
//		}
//		System.out.println();
//		System.out.println("a= "+a);
//		System.out.println("합계= "+sum);

//		for(int i=65; i<=90; i++){
//			System.out.println((char)i+" ");	// 0=48,A=65,a=97
//		}
//		System.out.println();

//		for(int i='A'; i<='Z'; i++){
//			System.out.print(i+" ");
//		}
//		System.out.println();

		// 다중 for문
//		for(int m=1; m<=3; m++){	// m=1,2,3
//			System.out.println("m= "+m);
//			for(int n=1; n<=4; n++){	// n=1,2,34
//				System.out.print("n= "+n+"\t");
//			}
//			System.out.println();
//		}

//		for(char i=65; i<=90; i++){
//			System.out.print(i+" : ");
//			for(char j=i; j<='Z'; j++){
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		System.out.println();

		// continue, break
//		for(int i=1; i<=10; i++){
//			if (i=7)
//			{
//				continue;
//			}
//			System.out.print(i+" ");
//		}
//		System.out.println();

		int kk=0;
		for(;;){
			
			if(kk==5) break;
			System.out.println(kk+" ");	//무한루프
			kk++;
		}
	}
}
