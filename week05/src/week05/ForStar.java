package week05;

public class ForStar {
	public static void main(String[] args) {
		// 랜덤 숫자 생성 : 1 ~ 10 사이의 정수
		int num = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤 숫자 : " + num);
		
		for(int i = 1; i <= num; i++) {
			System.out.print("*");
		}
	}
}
