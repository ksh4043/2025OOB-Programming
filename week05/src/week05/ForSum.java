package week05;

public class ForSum {

	public static void main(String[] args) {
		// for 문 : 횟수 반복
		// 1 ~ 100 까지의 합
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 100 까지의 합 : " + sum);
	}

}
