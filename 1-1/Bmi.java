import java.util.Scanner;

public class Bmi {
	public static void main (String args[]){
		
		//기본으로 쓰는 String(기본제공O)
		/*
		String name="차은우";
		System.out.println("내가 좋아하는 연예인은 "+name+" 입니다.");
		*/

		//사용자로부터 내용을 입력받을때 쓰는것(기본제공X)
		/*
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 좋아하는 연예인은 누구입니까? : "); //옆에 쓰려면 println=>print 로 바꿔야됨 | 한글은 깨짐
		name = sc.next();
		System.out.println("당신이 좋아하는 연예인은 "+name+" 입니다.");
		
		float height = 1.82f;
		float weight = 68.8f;
		float result;
		result = weight / (height * height);
		System.out.println("당신의 체질량 지수는 "+result+"입니다.");
		*/

		/*String name, bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ***** 지금부터 당신의 체질량 지수를 측정하겠습니다. ***** ");
		System.out.println();
		
		float height, weight;
		
		System.out.print("이름 입력 : ");
		name = sc.next(); //문자입력 next
		
		System.out.print("키 입력 : ");
		height = sc.nextFloat(); //실수입력 nextFloat

		System.out.print("몸무게 입력: ");
		weight = sc.nextFloat();
		
		float result = weight / (height*height);*/
		
		/*
		if(result > 30.0) {
				bmi = "비만";
		}
		else if(result > 25.0) {
				bmi = "과체중";
		}
		else if(result > 18.5) {
				bmi = "정상";
		}
		else {
				bmi = "저체중";
		}
		//제어문 if,switch-case

		// switch~case 문으로 작성 : 정수, break, default
		
		int su=(int)result; //[강제형변환]result=실수 , su = result가 정수로 변환
		switch(su) {
					
					case 15: case 16: case 17:
							bmi="저체중";
							break;
					case 18: case 19: case 20: case 21:
					case 22: case 23: case 24: case 25:
							bmi="정상";
							break;
					case 26: case 27: case 28: case 29:
					case 30:
							bmi="과체중";
							break;
					default:
							bmi="비만";
							break;
		

		}
		*/

		//System.out.println(name+"님의 체질량 지수는 "+(int)result+" 이고, 결과는"+bmi+" 입니다."); //앞에 int붙이면 정수 나옴


		/*반복문 : for : 횟수고정
				while : 횟수 X -> zero or more
				do while : 횟수 X -> one or more*/

		//for(int i=1; i<=5; i++) { //초기값; 비교식; 증감식 cls cmd초기화
					//System.out.println(i); //(i+10)은 11, (i+"번째 반복)은 1번째 반복문 }

		/*
		int i =1;
		while(i<=5) {										초기값;
				System.out.print(i+"번째 반복");			while(비교식)
				//if(i==5) break; 항상 true 일때
				i++;										증감식;
		}
		*/

		Scanner sc = new Scanner(System.in, "EUCKR"); //한글코드 "EUCKR"

		while(true) {

				String name, bmi;

				System.out.println();
				System.out.println(" ***** 지금부터 당신의 체질량 지수를 측정하겠습니다. ***** ");
				System.out.println();

				float height, weight;
		
				System.out.print("이름 입력 : ");
				name = sc.next(); //문자입력 next
		
				System.out.print("키 입력 : ");
				height = sc.nextFloat(); //실수입력 nextFloat

				System.out.print("몸무게 입력: ");
				weight = sc.nextFloat();
		
				float result = weight / (height*height);

				if(result > 30.0) {
				bmi = "비만";
				}
				else if(result > 25.0) {
				bmi = "과체중";
				}
				else if(result > 18.5) {
				bmi = "정상";
				}
				else {
				bmi = "저체중";
				}
				
				System.out.println(name+"님의 체질량 지수는 "+result+" 이고, 결과는"+bmi+" 입니다.");

				System.out.print("계속하시겠습니까? (y or n) : ");
				String choice = sc.next();
				
				//if(choice.equals("n") || choice.equals("N") ) break; //==은 숫자만 가능 || 또는, 대소문자 구분
				if(choice.equalsIgnoreCase("n")) break; //대소문자 구분 안해요~
		}
		
				System.out.println("이용해주셔서 감사합니다.");

	}
}