package week12;

public class Buds implements EarPhone {
	public Buds() {
		System.out.println("\nSamsung Buds 연결");
	}

	@Override
	public void play() {
		System.out.println("Samsung Buds 노래 시작했다~");
	}

	@Override
	public void stop() {
		System.out.println("Samsung Buds 노래 끝났다~");
	}

}
