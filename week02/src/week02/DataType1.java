package week02;

public class DataType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 데이터 타입
		// 직접 값을 주는 초기값 => literal
		// 정수형
		byte bData = 65;	// byte = 1 byte
		char cData = 65;	// char = 2 byte
		short sData = 65;	// short = 2 byte
		int iData = 65;		// int = 4 byte
		long lData = 65;	// long = 8 byte
		
		// 실수형
		float fData = 65.12f;	// float type 의 초기화는 f를 붙여줌  4 byte
		double dData = 65.11;	// double = 8 byte
		
		// 논리형
		boolean boolData = true;	// boolean = 1 byte
		
		System.out.println("bData : " + bData);
		System.out.println("cData : " + cData);
		System.out.println("sData : " + sData);
		System.out.println("iData : " + iData);
		System.out.println("lData : " + lData);
		System.out.println("fData : " + fData);
		System.out.println("dData : " + dData);
		System.out.println("boolData : " + boolData);
	}

}
