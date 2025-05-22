package week11;

public abstract class Animal {
	// 추상 클래스 => 객체 생성 불가
	// 상속은 가능
	public String kind;
	
	// 모든 동물에 동일하게 적용
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 모든 동물은 소리를 낸다.
	// 모든 동물은 모두 다른 소리를 낸다.
	// 자식 클래스에서 반드시 재정의 해야 함.
	// 추상 메소드 => 실행문이 없음, 메소드 형태만 선언
	public abstract void sound();
}
