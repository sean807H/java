class ArrayExam3 
{
	public static void main(String[] args) 
	{
		int a[] = new int[3];
		a[0] = a[0]+1; // 초기값이 0이라 오류아님
		a[1] = a[1]+1; 
		a[2] = a[2]+1; 

		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}

	}
}
