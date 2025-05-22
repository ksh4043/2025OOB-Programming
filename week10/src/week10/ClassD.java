package week10;

public class ClassD {
	//필드 접근 제한자
	public int field1;
	int field2; // default 접근 제한자                                      
	private int field3;
	
	public ClassD() {
		// 클래스 내부에서는 접근 제한자의 영향을 받지 않는다
		field1 = 10;
		field2 = 20;
		field3 = 30;
		
		method1();
		method2();
		method3();
	}
	
	//메소드 접근 제한자
	public void method1() {
		
	}
	
	void method2() {
		// default 접근 제한자
	}
	
	private void method3() {
		 
	}
}
