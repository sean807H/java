import java.util.Scanner;
class For_Study_03 
{
	public static void main(String[] args) 
	{
		// (문제1) 두 개의 주사위를 던졌을때, 합이 6이 되는 모든 경우의 수를 출력하시오. 단, for문을 이용할 것
//		int i,j,count = 0;
//		for(i=1; i<7; i++){
//			for(j=1; j<7; j++){
//				if((i+j)==6){
//					count++;
//					System.out.println(i+" "+j);
//				}
//			}
//		}
//		System.out.println("경우의 수="+count);

		// (문제2) 문자형 숫자를 입력받아 각 자리의 합을 구하시오.
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		System.out.print("문자형 숫자를 입력해주세요 : ");
//		String a = sc.next();
//		System.out.println(a.length());
		
//		for(int i=0; i<a.length(); i++){
//			System.out.println(a.charAt(i));	//call by reference -> call by value
//			sum+=(a.charAt(i)-'0');
//		}
//			System.out.println("sum = "+sum);

		//	(문제3) 정수를 입력받아 각 자리의 합을 구하시오.
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		System.out.print("숫자를 입력해주세요 : ");
//		int num=sc.nextInt();	//1,2,3,4,5
//
//		while(num>0){
//			sum+=(num%10);	//5
//			num/=10;		//1234
//		}
//		System.out.println("sum = "+sum);

		// (문제4) i번째 피보나치 수열 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("i번째 피보나치 수열(i값 입력) : ");
//		int count=sc.nextInt();
//		int num1=1;
//		int num2=1;
//		int num3=0;
//		System.out.print(num1+" "+num2);
//
//		for (int i=1; i<=(count-2); i++)
//		{
//			num3=num1+num2;
//			System.out.print(" "+num3);
//			num1=num2;
//			num2=num3;
//		}
//			System.out.println();

		// 일반적인 for문
//		int arr[]={10,20,30,40,50};
//		int sum=0;
//		for(int i=0; i<arr.length; i++){
//			sum+=arr[i];
//		}
//			System.out.println("sum = "+sum);
		
		// 향상된 for문 - Collection(배열) 클래스와 함께
//		int arr[]={10,20,30,40,50};
//		int sum=0;
//		for(int a : arr){	// 파라미터 3 -> 2 for(배열의 data type : 배열이름)
//		System.out.println(a);	//10,20,30,40,50
//			sum+=a;
//		}
//		System.out.println("sum = "+sum);

		// (문제5) 1~100 사이의 숫자중에서 3의 배수이면서 5의 배수인 수의 갯수와 합을 출력하시오.
		int count=0, sum=0;
		for(int i=1; i<=100; i++){
			if(i%3==0 && i%5==0){
				count++;
				sum+=i;
			}
		}
		System.out.println("count = "+count+" sum = "+sum);
	}
}
