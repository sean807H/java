/*interface PhoneInterface{		// 인터페이스는 다중상속이 가능하다!!! 무조건 부모여야한다
								// 인터 extends 인터 / 인터 implements 클래스
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface{
	//PhoneInterface의 모든 추상 메소드 구현
//	@overrride
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	//메소드 추가 작성
	public void flash() {
		System.out.println("전화가에 불이 켜졌습니다");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}*/
