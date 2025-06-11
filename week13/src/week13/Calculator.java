package week13;

public class Calculator {
	// 공유 객체를 위한 클래스
	private int memory;
	
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) throws InterruptedException {
		this.memory = memory;
		
		Thread.sleep(2000);
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory); // 현재 실행하고 있는 Thread의 이름
	}

	
}
