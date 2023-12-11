package javabasic3.ch06.sec11;

public class Car {

	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
    int speed;
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
public Car() {
	// TODO Auto-generated constructor stub
}

}
