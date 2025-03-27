package week04;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		String mobile = "nothing";
		
		switch(mobile) {
		case "iPhone" -> System.out.println("애플 제품");
		case "Galaxy" -> System.out.println("삼성 제품");
		default -> System.out.println("집 가고 싶다");
		}
		
		// 점수를 입력 받아 switch 문장으로 등급 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 해라. ");
		int score = scanner.nextInt();
		switch(score / 10) {
		case 10, 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("닌 F다ㅇㅇ 집에나 가라 그냥");
			break;
		}
		
		scanner.close();
	}
}
