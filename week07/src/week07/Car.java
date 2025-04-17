package week07;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 생성자 오버로딩(overloading) => 객체 초기화를 다양하게
	Car(){
		
	}
	
	Car(String model){
//		this.model = model;
//		this.color = "black";
//		this.maxSpeed = 300;
		this(model, "black", 300);
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 200;
		this(model, color, 200);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model, String color, int maxSpeed, int speed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

}
