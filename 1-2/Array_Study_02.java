class  Array_Study_02
{
	public static void main(String[] args) 
	{
		int score[]={79,88,91,33,100,55,95};
		int max=score[0],min=score[0];	// max=79
		
		for(int i=0; i<score.length; i++){
//			System.out.println(score[i]);
			if(max<score[i]){
				max=score[i];
			}
			if(score[i]<min){
				min=score[i];	
			}
			
		}
		System.out.println("최대값 "+max);
		System.out.println("최솟값 "+min);
	}
}
