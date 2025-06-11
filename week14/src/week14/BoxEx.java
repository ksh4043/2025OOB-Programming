package week14;

public class BoxEx {
	public static void main(String[] args) {
		// 구체적인 데이터 타입별로 객체 생성
		Box<String> box1 = new Box<>();
		box1.setT("Hello");
		String sval = box1.getT();
		
		Box<Integer> box2 = new Box<>();
	}
}
