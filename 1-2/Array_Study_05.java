import java.util.Scanner;

class Array_Study_05 
{
	public static void main(String[] args) 
	{
//		int scores[]=new int[5];
//		int sum=0;
//		float average=0;
//		
//		Scanner sc=new Scanner(System.in);
//
//		for(int i=0; i<scores.length; i++){
//			System.out.println(i);
//			System.out.print((i+1)+"번째 학생의 점수를 입력하세요: ");
//			scores[i]=sc.nextInt();
//			sum+=scores[i];
//		}
//
//		average=sum/(float)scores.length;
//		System.out.println();
//		System.out.println("총점 = "+sum);
//		System.out.println("평균 = "+average);

//		scores[0]=sc.nextInt();
//		scores[1]=sc.nextInt();
//		scores[2]=sc.nextInt();
//		scores[3]=sc.nextInt();
//		scores[4]=sc.nextInt();
		
		int totalSum=0;	//전체총점
		int totalAvg=0;	//전체평균
		Scanner sc=new Scanner(System.in, "EUCKR");
		System.out.print("학생수를 입력하세요 : ");
		int su=sc.nextInt();	// su=3
		String name[]=new String[su];
		int score[][]=new int[su][5];
		
		for(int i=0; i<su; i++){	// name.length or score.length
			System.out.print((i+1)+"번 학생의 이름 입력 : ");
			name[i]=sc.next();
			System.out.print("국어 점수 : ");
			score[i][0]=sc.nextInt();	//국어점수
			System.out.print("영어 점수 : ");
			score[i][1]=sc.nextInt();	//영어점수
			System.out.print("수학 점수 : ");
			score[i][2]=sc.nextInt();	//수학점수
			
			//총점
			score[i][3]=score[i][0]+score[i][1]+score[i][2];
			//평균
			score[i][4]=(int)(score[i][3]/3);
			//전체총점
			totalSum+=score[i][3];
			//전체평균
			totalAvg+=score[i][4];
			
		}
			
			System.out.println();
			System.out.println("============================================");
			System.out.println("이름	국어   영어    수학     총점	평균");
			System.out.println("============================================");
			for(int i=0; i<name.length; i++){
				System.out.print(name[i]+"\t");
				for(int j=0; j<5; j++){
					System.out.print(score[i][j]+"\t");
				}

				System.out.println();
				System.out.println("============================================");

			}
				System.out.println("전체총점: "+totalSum+" 전체평균: "+(int)(totalAvg/su));
				//su=학생수,name=학생이름,score=학생점수
				//su=name.length=score.length
	}
}
