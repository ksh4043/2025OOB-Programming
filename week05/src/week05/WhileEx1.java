package week05;

public class WhileEx1 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합 구하기
		int num = 1;
		int sum = 0;
		
		while(num < 101) {
			sum += num;
			num++;
		}

		System.out.println("1 ~ 100의 합 : " + sum);
	}

}
