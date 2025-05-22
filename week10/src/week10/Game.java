package week10;

public class Game {
	private String title;
	private String version;
	
	Game(String title, String version){
		setTitle(title);
		setVersion(version);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void start() {
		System.out.println(this.title + " 게임을 시작합니다.");
	}
	
	
}
