import java.util.Scanner;
class Array_Study_06 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in, "EUCKR");
		String name[]=new String[5];
		for(int i=0; i<name.length; i++){	
			System.out.print((i+1)+"번째 연예인 이름 입력 : ");
			name[i]=sc.next();
		}
		
		for(int i=0; i<name.length; i++){
			if(i%2==1){
				System.out.println(name[i]);	//짝수 연예인
			}
			
		}
	}
}
