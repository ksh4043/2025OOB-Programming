package week12;

public class AirPods implements EarPhone {
	public AirPods() {
		System.out.println("\n새로 구입한 Apple AirPods 연결");
	}

	@Override
	public void play() {
		System.out.println("Apple AirPods 노래 시작했다~");
	}

	@Override
	public void stop() {
		System.out.println("Apple AirPods 노래 끝났다~");
	}

}
