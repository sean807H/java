class park_while1 
{
	public static void main(String[] args) 
	{
		int i =1;
/*
		while(true)
		{
			if(i>10)
			{
				break;
			}
			 System.out.println("안녕하세요"+i);
			 i++; //증감식 선언
		}
*/
		for(;;)
		{
			if(i>10)
			{
				break;
			}
			if(i%2==0)
			{
				i++; //증감식이 없으면 무한루프
				continue; //무시
			}
				System.out.println("안녕하세요"+i);
				i++;
		}
	}
}
