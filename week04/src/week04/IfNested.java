package week04;

public class IfNested {

	public static void main(String[] args) {
		// 랜덤 함수를 이용해서 0 ~ 100 사이의 점수 생성
		int score = (int)(Math.random() * 100);
		
		String grade;
		
		if(score >= 90) {
			if(score > 95) {
				grade = "A+";
			}if(score > 93) {
				grade = "A0";
			}else {
				grade = "A-";
			}
		}else if (score >= 80) {
			if(score > 85) {
				grade = "B+";
			}if(score > 83) {
				grade = "B0";
			}else {
				grade = "B-";
			}
		}else {
			grade = "꽝";
		}
		
		System.out.println(grade);

	}

}
