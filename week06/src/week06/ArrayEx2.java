package week06;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 길이가 10인 정수 타입의 배열을 선언
		int[] scores = new int[10];
		int totalScore = 0;
		
		// 각 배열 값에 랜덤하게 점수 할당
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 100);
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
			totalScore += scores[i];
		}
		
		double avgScore = (double)totalScore / scores.length;
		
		System.out.println("어 이게 느들 총점이다~ " + totalScore);
		System.out.println("어 이게 느들 평균이다~ " + avgScore);
		
	}
}
