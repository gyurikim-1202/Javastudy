package ch06.sec06.exam04;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	public Car(String model) {
		super();
		this.model = model;
	}


	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
	}


	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	


}
