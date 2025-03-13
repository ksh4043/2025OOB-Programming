package week02;

public class DataType4 {
	public static void main(String[] args) {
		byte iData = 127;	// byte type 변수는 -128 ~ 127 [out of range] 128 -> 127
		char cData = 90;	// char type 변수는 음수가 없음 -90 -> 90
		float fData = 3.14f;	// float type 변수는 f 키워드로 초기화
		// 정수형태 -> 기본이 int로 인식하기 때문에 l 키워드로 long type 으로 인식
		long lData = 1000000000000l;
		boolean boolD = true;	// boolean type 변수는 true or false
		
			
		
		System.out.println("iData : " + iData);
		System.out.println("cData : " + cData);
		System.out.println("fData : " + fData);
		System.out.println("lData : " + lData);
		System.out.println("boolD : " + boolD);
	}
}
