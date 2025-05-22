package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		
		// 부모한테서 상속받은 메소드라도 자식 클래스에서 재정의 되면 재정의된 메소드가 호출됨
		c.method2();
		c.method3();
		c.field1 = "aaa";
		c.field2 = "bbb";
		
		System.out.println("자동타입 변환");
		// 클래스의 자동 타입 변환
		// 부모 클래스 변수 <= 자식 객체를 대입
		Parent p = c;
		p.method1();
		// 자동 타입 변환이 적용된 경우
		// 부모 클래스 변수라도 자식 클래스에서 재정의된 메소드 호출
		p.method2();
		
		// 자식 객체가 부모 클래스 변수에 자동타입 변환이 되어도
		// 부모 클래스 변수는 자식 클래스에만 정의된 메소드는 호출 불가
		// 부모 클래스 변수는 부모 클래스에 정의된 것만 접근 가능
//		parent.method3();
		
		p.field1 = "aaa";
//		p.field2 = "bbb";
		
		// 강제타입 변환(casting)
		// 다시 자식 클래스에만 정의된 필드나 메소드를 접근하려면
		// 강제 타입 변환이 필요
		Child c2 = (Child)p;
		c2.field2 = "bbb";
		c2.method3();
		
		// 순수 부모 객체를 casting
		Parent p2 = new Parent();
//		Child c3 = (Child)p2;
//		c3.method3();
	}
}
