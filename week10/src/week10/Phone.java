package week10;

public class Phone {
	// 자식 객체의 공통된 속성과 기능을 뽑아서 클래스로 선언 => 부모 클래스
	// 부모의 private => 상속 X
	
	private String model;
	private String color;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("상대방 : " + msg);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
