package week05;

public class Break {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random() * 10);
			System.out.println("랜덤 숫자 : " + num);
			
			if(num == 7) {
				break;
			}
		}
		System.out.println("숫자 7 나와서 종료시켰음 ㅇㅇ");
	}

}
