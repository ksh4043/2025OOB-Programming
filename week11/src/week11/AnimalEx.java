package week11;

public class AnimalEx {
	public static void main(String[] args) {
		// 추상 클래스는 객체 생성이 불가능
		// 대신, 상속은 가능
//		Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		Animal animal = dog;	// 자동타입 변환
		animal.sound();
		animal = cat;
		animal.sound();
		
		System.out.println("---- 매개변수의 다형성 ----");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		//animal.dogLife();
		
		// 자식 클래스에만 정의된 필드나 메소드는
		// 강제타입 변환을 해야 접근이 가능
		if (animal instanceof Dog) {
			((Dog)animal).dogLife();
		}else if (animal instanceof Cat) {
			((Cat)animal).catLife();
		}
	}
}
