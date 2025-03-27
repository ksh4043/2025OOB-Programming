package week04;

import java.util.Scanner;

public class IfStudent {

	public static void main(String[] args) {
		// 외부로부터 데이터 입력 -> Scanner 클래스
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("태어난 연도 입력 : ");
		int year = scanner.nextInt();
		int age = 2025 - year;
		
		if(age >= 20 && age <= 26) {
			System.out.println("대학생");
		}else if(age >= 17 && age < 20) {
			System.out.println("고등학생");
		}else if(age >= 14 && age < 17) {
			System.out.println("중학생");
		}else if(age >= 8 && age < 14) {
			System.out.println("초등학생");
		}else {
			System.out.println("학생이 아닙니다.");
		}
		
		//System.out.println(year);
	}

}
