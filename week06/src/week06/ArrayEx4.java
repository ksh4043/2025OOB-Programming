package week06;

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = {"유비","관우","장비","조조","초선"};
		
		System.out.print("누구 찾는데~ >> ");
		String name = scanner.next().trim();
		
		boolean found = false;
		
		for(int i = 0; i < names.length; i++) {			
			if(names[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("어어~ " + name + " 임마 있네 있어~");
		}else {
			System.out.println(name + "(이)란 아는 없다는디?");
		}
		
		scanner.close();
	}
}
