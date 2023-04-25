package ch07.sec03;
//Phone 클래스 상속받는 필드 생성
public class SmartPhone extends Phone {
	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");

	}
}
