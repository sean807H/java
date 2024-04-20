class ForExam3 
{
	public static void main(String[] args) 
	{
		int sum=0;
		System.out.print("1-2+3-4+5-6+7-8+9-10=");
		for (int i=1; i<=10; i++)
		{
//			System.out.println(i);
			if(i%2==1){
				sum+=i;
//				System.out.println("홀수: "+ i);
			}
			else{
				sum-=i;
//				System.out.println("짝수: "+ -i):
			}
		}
		System.out.println(sum);
	}
}
