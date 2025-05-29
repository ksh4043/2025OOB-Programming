package week12;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켜짐");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 꺼짐");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
