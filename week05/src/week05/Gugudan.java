package week05;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력해~ : ");
		int dan = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
		}

	}

}
