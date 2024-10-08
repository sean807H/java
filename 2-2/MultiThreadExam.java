package two_2;


class Summing{
	private int sum;
	public synchronized void sumTo(int num) {
		sum = 0;
		for(int i = 0; i<=num; i++) {
			sum+=i;
			System.out.println("스레드 >> "+Thread.currentThread().getName());
			System.out.println("의 1 ~ "+i+"까지의 합 >> "+sum);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
	public int getSum() {return sum;}
}

class MultiThreadExam extends Thread{
	private Summing sum;
	private int num;
	public MultiThreadExam(String s, Summing sum, int num) {
		super(s);
		this.sum = sum;
		this.num = num;
		System.out.println("스레드 : "+getName()+"가 시작됨");		// Thread 에 getName 이 정의되어있음
	}
	public void run() {
		sum.sumTo(num);
		System.out.println("스레드 : "+getName()+"가 종료됨");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summing sum = new Summing();
		MultiThreadExam a = new MultiThreadExam("A",sum,5);
		MultiThreadExam b = new MultiThreadExam("B",sum,5);
		a.setPriority(8);		// 우선순위 설정
		b.setPriority(10);
		a.start();
		b.start();
	}

}
