package week05;

import java.util.Scanner;

public class ScoreGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수 입력 >> ");
			int score = scanner.nextInt();
			char grade;
			
			if(score < 0) {
				System.out.println("종료");
				break;
			}
			
			if(score > 100) {
				System.out.println("점수가 어떻게 100점을 넘냐?ㅋㅋ");
				break;
			}
			
			if(score >= 90) {
				grade = 'A';
			}else if(score >= 80) {
				grade = 'B';
			}else if(score >= 70) {
				grade = 'C';
			}else if(score >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println("SCORE\t\t\tGRADE");
			System.out.println("======================================");
			System.out.println(score+"\t\t\t"+grade);
		}
		
		scanner.close();
	}

}
