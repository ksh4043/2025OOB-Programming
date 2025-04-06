package week05;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		// 무한 루프 : while(true)
		Scanner scanner  = new Scanner(System.in);
		int num1, num2;
		int count = 1;
		
		while(true) {
			System.out.print("첫번째 정수 입력 : ");
			num1 = scanner.nextInt();
			System.out.print("두번째 정수 입력 : ");
			num2 = scanner.nextInt();
			
			System.out.println("두 수의 합은 : " + (num1 + num2));	
			System.out.println("반복횟수 : " + count);
			count++;
			if(count > 10) {
				break;
			}
		}
		
		scanner.close();
	}
}
