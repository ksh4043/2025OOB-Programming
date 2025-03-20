package week03;

public class TwoOperand2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교연산자 : >, >=, <. <=, ==, !=
		// 논리연산자 : &&(AND, &), ||(OR, |)
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90) {
			// true		and		true -> 둘 다 true 인 경우 결과가 true
			// 65 <= charCode1 <= 90
			System.out.println((char)charCode1 + "는 알파벳 대문자");
		}
		
		int charCode2 = 'b';
		if (charCode2 >= 97 && charCode2 <= 122) {
			System.out.println((char)charCode2 + "는 알파벳 소문자");
		}
		
		char charCode3 = '9';
		if (!(charCode3 < 48) && !(charCode3 > 57)) {
			// 48 <= charCode3 <= 57
			System.out.println(charCode3 + "는 0~9 사이의 숫자");
		}
		
		int iValue = 4;
		if((iValue % 2 == 0) || (iValue % 3 == 0)) {
			System.out.println(iValue + "는 2 또는 3의 배수");
		}else {
			System.out.println("아님");
		}
	}

}
