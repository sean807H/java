class park_for1 
{
	public static void main(String[] args) 
	
	{
		int i;
		int gu = 2;s
		
		for(gu=2; gu<10; gu++)
		{
			if( (gu % 2)==0)
			{
				for(i=1; i<10; i++)
				{
					System.out.print(gu+" * "+i+" = "+gu*i+"\t");
				}
			}
			System.out.println("");
		}
	}
}
