class WhileExam2 
{
	public static void main(String[] args) 
	{
		System.out.print("1-2+3-4+5-6+7-8+9-10=");
		int i=1,sum=0;
		while (i<=10)
		{
			if(i%2==1){
//				System.out.println("홀수 "+i);
				sum += i;
			}
			else{
//				System.out.println("짝수 "+i);
				sum -= i;
			}
			i++;	//++i
		}
//		System.out.println("i값= "+i);
		System.out.println(sum);
	}
}
