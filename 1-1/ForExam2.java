class ForExam2
{
	public static void main(String[] args) 
	{
		int evenSum=0;
		int oddSum=0;

		for (int i=1; i<=10; i++)
		{
		
			if(i%2==0) evenSum+=i;	//evenSum=sum+1;
			
			else oddSum+=i;
		}
//		System.out.println("짝수합 = "+evenSum);
//		System.out.println("tot = "+oddSum);
		System.out.println("1부터 10까지의 짝수합은 "+evenSum+"이고, "+"홀수합은 "+oddSum+"입니다.");
	}
}
