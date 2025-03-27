package week04;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.print("키(cm)를 입력하세요 : ");
		int height = scanner.nextInt();
		System.out.print("몸무게(kg)를 입력하세요 : ");
		int weight = scanner.nextInt();
		double meterHeight = (double)height / 100;
		
		double BMI = (weight / (meterHeight * meterHeight));
		
		String health;
		
		if(BMI >= 18.5 && BMI < 23) {
			health = "정상";
		}else if(BMI >= 23 && BMI < 25) {
			health = "과체중";
		}else if(BMI >= 25 && BMI < 30) {
			health = "비만";
		}else if(BMI >= 30) {
			health = "고도비만";
		}else {
			health = "뭐임?";
		}
		
		System.out.println(name + "님의 키는 " + height + "cm이고 몸무게는 " + weight + "kg입니다.");
		System.out.printf("BMI 지수는 %.2f이고 %s입니다.", BMI, health);
		
		scanner.close();
	}
}
