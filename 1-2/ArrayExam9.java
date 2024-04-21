class ArrayExam9 
{
	public static void main(String[] args) 
	{
		int a[],b[];
		int c[]={31,32,33};

//		System.out.println(c[0])	//31(쓰레기값이됨)

		a=new int[4];
		b=new int[]{21,22,23,24};
		c=b;	//b의 주소를 c에 넘겨줌

//		System.out.println(c[0])	//21

		System.out.println(a.length+" "+b.length+" "+c.length);
	}
}
