package week03;

public class ThreeOperand1 {

	public static void main(String[] args) {
		// 삼항 연산자 -> (조건식) ? true : false
		int num1 = 35;
		int num2 = 47;
		String result;
		
		result = (num1 > num2) ? "num1 이 더 큼" : "num1 이 더 작음";
		System.out.println(result);
		
		boolean bResult = (num1 > num2) ? true : false;
		System.out.println(bResult);
		
		int score = 85;
		result = (score >= 90) ? "우수" : ((score >= 80) ? "보통" : "ㅋㅋ");
		System.out.println(result);
	}
}
