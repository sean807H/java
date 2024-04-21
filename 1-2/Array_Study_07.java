import java.util.Scanner;
class Array_Study_07 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num[]=new int[7];

		for(int i=0; i<num.length; i++){
			System.out.print((i+1)+"번째 숫자 입력 : ");
			num[i]=sc.nextInt();
		}
		
		System.out.print("원본 데이터 : ");
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+"  ");
		}
		System.out.println();

		int max=num[0];
		int min=num[0];
		// num에 값을 넣지도 않았는데 위에 생성해서 0이 나옴
		// if(i==0) min=num[i] 로 위에서 바꾸는 방법이 있다.

		for(int i=0; i<num.length; i++){
			if(num[i]>max){
				max=num[i];
			}
			else if(min>num[i]){
				min=num[i];
			}
		}
		System.out.println("최댓값 : "+max+" 최솟값 : "+min);
	}
}
