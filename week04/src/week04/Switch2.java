package week04;

public class Switch2 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A': case 'a':
			System.out.println("A등급");
			break;
		case 'B': case 'b':
			System.out.println("B등급");
			break;
		case 'C': case 'c':
			System.out.println("C등급");
			break;
		case 'D': case 'd':
			System.out.println("D등급");
			break;
		default:
			System.out.println("ㅋㅋ좀 열심히 해라 임마~");
			break;
		}
		
		// switch 표현식
		switch(grade) {
		case'A', 'a' -> {
			System.out.println("A등급");
			System.out.println("우수회원");
		}
		case'B', 'b' -> {
			System.out.println("B등급");
			System.out.println("일반회원");
		}
		default -> {
			System.out.println("손님");
		}
		}
		
		System.out.println();
		switch(grade) {
		case 'a', 'A' -> System.out.println("우수 회원");
		case 'b', 'B' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}
	}
}
