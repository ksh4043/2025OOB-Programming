package week12;

public interface RemoteControl {
	// 인터페이스 선언
	// 필드 선언 -> 상수 필드(public static final)
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// 모든 구현 객체에서 사용하는 기능을 모아 놓은 것
	// 인터페이스에서 선언된 메소드는 실행문이 없음 -> 추상 메소드
	// public abstract 생략해도 컴파일 과정에서 자동 생성
	
	void turnOn();
	
	// 새로운 기능 추가
	void turnOff();
    void setVolume(int volume);
    
    // default 메소드로 선언 => 기존 구현 클래스에는 영향을 주지 않는다.
    // default 메소드는 반드시 실행문을 포함해야함
    default void setMute(boolean mute) {
	    if (mute) {
	    	System.out.println("무음 처리합니다.");
	    } else {
	    	System.out.println("무음 해제합니다.");
	    }
    }
}
