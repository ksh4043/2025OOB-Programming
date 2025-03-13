package week02;

public class Print {

	public static void main(String[] args) {
		System.out.println("객체 지향 프로그래밍");	
//		System.out.println("객체");
//		System.out.println("지향");
//		System.out.println("프로그래밍");
		
		// 숫자 출력 시 주의사항
		System.out.println(17 + 35);
		System.out.println("17 + 35 = " + (17 + 35));
		
		// 프린트 출력 포맷 - printf
		// % : 프린트 포맷 기호		
		// %s : 문자열
		// %d : 정수
		// %f : 실수
		// %c : 문자
		// %b : boolean
		// \n : 줄바꿈
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d세\n", 25);
		System.out.printf("과목 : %s, %s, %s\n", "Java", "C++", "JavaScript");
	}

}
