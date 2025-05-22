package week10;

public class SmartPhone extends Phone {
	// 추가로 필요한 필드나 메소드 선언 가능
	private boolean wifi;

	public boolean isWifi() {
		return wifi;
	}
	
	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
}
