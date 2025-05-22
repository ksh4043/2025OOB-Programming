package week11;

public class GameEx {
	public static void main(String[] args) {
		// 다형성 구현
		Game[] games = new Game[3];
		games[0] = new LOL("롤", "13.0");
		games[1] = new Tetris("테트리스", "12.5");
		games[2] = new SuperMario("슈퍼마리오", "15.1");
		
		for (int i = 0; i < games.length; i++) {
			games[i].start();
			games[i].gameDesc();
			System.out.println("-----------------");
		}
		
		// 향상된 for 문 사용
		for (Game game : games) {
			game.start();
			game.gameDesc();
			System.out.println("-----------------");
		}
	}
}
