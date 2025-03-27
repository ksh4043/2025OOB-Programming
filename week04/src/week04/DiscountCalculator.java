package week04;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품 구매 가격 입력 >> ");
		int price = scanner.nextInt();
		int discount;
		
		if(price >= 100000) {
			discount = 10;
		}else if(price >= 50000) {
			discount = 5;
		}else {
			discount = 1;
		}
		double finalPrice = price - price * (discount / 100.0);
		System.out.println("원래 가격 : " + price + "원");
		System.out.println("할인율 : " + discount + "%");
		System.out.printf("최종 가격 : %.0f원\n", finalPrice);
		
		scanner.close();
	}
}
