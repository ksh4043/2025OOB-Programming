package week03;

public class TwoOperand3 {

	public static void main(String[] args) {
		// 비트 연산자 : &(and), |(or), ^
		// 2진수 연산
		byte num1 = 45;
		byte num2 = 25;
		int result = num1 & num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		
		// &(and)
		System.out.printf("num1 : %6s, num2 : %6s\n", Integer.toBinaryString(num1), Integer.toBinaryString(num2));
		System.out.printf("result : %6s\n", Integer.toBinaryString(result));
		
		// |(or)
		result = num1 | num2;
		System.out.printf("num1 : %6s, num2 : %6s\n", Integer.toBinaryString(num1), Integer.toBinaryString(num2));
		System.out.printf("result : %6s\n", Integer.toBinaryString(result));
		
		// ^(XOR)
		result = num1 ^ num2;
		System.out.printf("num1 : %6s, num2 : %6s\n", Integer.toBinaryString(num1), Integer.toBinaryString(num2));
		System.out.printf("result : %6s\n", Integer.toBinaryString(result));
	}

}
