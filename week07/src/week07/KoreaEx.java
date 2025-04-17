package week07;

public class KoreaEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "9999991234567", "010-1234-5678");
		
		System.out.println("국적 : " + k1.nation);
		System.out.println("이름 : " + k1.name);
		System.out.println("주민번호 : " + k1.pNum);
		System.out.println("전화번호 : " + k1.cont);
	}
}
