package two_2;

class Top implements Runnable{
	public void run() {
		for(int i =0; i<50; i++) {
			System.out.print(i+" \t");
		}
	}
}

public class Runnable2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		Top t = new Top();
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
	}

}
