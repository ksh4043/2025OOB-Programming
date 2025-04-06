package week05;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("메세지를 입력(종료 시 Q 입력) : ");
		String term;
		
		do {
			term = scanner.next().toUpperCase().trim();
			System.out.println(">> " + term);
		}while(!term.equals("Q"));
		
		scanner.close();
	}
}
