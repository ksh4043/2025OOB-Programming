package week05;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randInt = (int)(Math.random() * 100);
		
		while(true) {
			System.out.print("숫자를 맞혀 보세요(1~100) >> ");
			int user = scanner.nextInt();
			
			if(user > 100 || user < 0) {
				System.out.println("1~100 사이의 값을 입력하세요");
				continue;
			}
			
			if(user > randInt) {
				System.out.println("숫자가 너무 큽니다.");
			}else if(user < randInt) {
				System.out.println("숫자가 너무 작습니다.");
			}else {
				System.out.printf("정답입니다! 랜덤 숫자는 %d입니다.", randInt);
				break;
			}
		}
		
		scanner.close();

	}

}
