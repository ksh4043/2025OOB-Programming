package week10;

public class GameEx {
	public static void main(String[] args) {
		LoL lol = new LoL("롤", "13.0");
		Tetris tetris = new Tetris("테트리스", "12.5");
		SuperMario supermario = new SuperMario("슈퍼마리오", "15.1");
		
		System.out.println("제목 : " + lol.getTitle());
		System.out.println("버전 : " + lol.getVersion());
		lol.start();
		lol.lolDesc();
		System.out.println();
		
		System.out.println("제목 : " + tetris.getTitle());
		System.out.println("버전 : " + tetris.getVersion());
		tetris.start();
		tetris.lolDesc();
		System.out.println();
		
		System.out.println("제목 : " + supermario.getTitle());
		System.out.println("버전 : " + supermario.getVersion());
		supermario.start();
		supermario.lolDesc();
	}
}
