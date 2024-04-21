class  For_Study_02
{
	public static void main(String[] args) 
	{
//		long startTime=System.currentTimeMillis();
//		System.out.println(startTime);	// /1000초 /60분 /60시간
//		
//		for(long i=0; i<2000000000; i++){
//			
//		}
//		long endTime=System.currentTimeMillis();	//반복문 호출하고 난 다음
//
//		System.out.println("시작시간 : "+startTime);
//		System.out.println("종료시간 : "+endTime);
//		System.out.println("소요시간 : "+(endTime-startTime));

		System.out.println("****** 카운트 다운 ******");
		for(int i=10; i>0; i--){
			for(long j=0; j<2000000000; j++){}
				System.out.println(i);
		}
		System.out.println("Game over");

	}
}
