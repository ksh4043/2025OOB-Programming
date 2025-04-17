package week07;

public class CarEx {
	public static void main(String[] args) {
		// 실행클래스
		// 객체 생성
		Car myCar = new Car("그랜저", "black", 350, 100);

		// 필드값 출력
		// 객체의 속성(필드)에 접근할 때는 반드시 객체변수명으로 접근
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		// 필드값 변경
		// 외부 클래스에서는 반드시 필드값을 객체변수명으로 접근
//		myCar.speed = 100;
//		System.out.println("현재속도 : " + myCar.speed);
//		
		Car urCar = new Car();

		System.out.println("제작회사 : " + urCar.company);
		System.out.println("모델 : " + urCar.model);
		System.out.println("색상 : " + urCar.color);
		System.out.println("최고속도 : " + urCar.maxSpeed);
		System.out.println("현재속도 : " + urCar.speed);
		
		Car mySeCar = new Car("그랜저", "white", 350, 85);
		
		System.out.println("제작회사 : " + mySeCar.company);
		System.out.println("모델 : " + mySeCar.model);
		System.out.println("색상 : " + mySeCar.color);
		System.out.println("최고속도 : " + mySeCar.maxSpeed);
		System.out.println("현재속도 : " + mySeCar.speed);
		
		Car urSeCar = new Car("소나타", "black", 200);
		
		System.out.println("제작회사 : " + urSeCar.company);
		System.out.println("모델 : " + urSeCar.model);
		System.out.println("색상 : " + urSeCar.color);
		System.out.println("최고속도 : " + urSeCar.maxSpeed);
		System.out.println("현재속도 : " + urSeCar.speed);
	}
}
