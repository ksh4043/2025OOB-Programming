package week04;

public class RandomDice {

	public static void main(String[] args) {
		// 랜덤 함수 : Math.random() 이용 -> 0.0 ~ 0.99999 사이의 실수를 반환
		double num = Math.random();
		System.out.println(num);
		
		// 주사위 놀이 : 1 ~ 6
		int dice = (int)((Math.random() * 6) + 1);
		System.out.println(dice);
	}

}
