package week12;

public class TonFree implements EarPhone {
	public TonFree() {
		System.out.println("\nLG TonFree 연결");
	}

	@Override
	public void play() {
		System.out.println("TonFree 노래 시작했다~");
	}

	@Override
	public void stop() {
		System.out.println("TonFree 노래 끝났다~");
	}

}
