package week06;

public class Reference1 {
	public static void main(String[] args) {
		// 기본 데이터 타입 변수는 스택 영역에 값과 같이 저장
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1==iVal2 : " + (iVal1==iVal2 ? true : false));
		
		// 참조 타입 변수는 스택 영역에 저장
		// 해당 객체 값은 힙 영역에 저장
		// 객체 주소가 스택에 있는 변수에 저장
		// 문자열 리터럴은 값이 동일하면 같은 주소를 공유
		// String : 가장 대표적인 클래스 타입
		
		String sVal1 = "Java";
		String sVal2 = "Java";
		System.out.println("sVal1==sVal2 : " + (sVal1==sVal2 ? "참조가 같다" : "참조가 다르다"));
		
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4 : " + (sVal3==sVal4 ? "참조가 같다" : "참조가 다르다"));

		// 참조변수가 null 값을 가지면 해당 객체는 힙 영역에 생성 X
		// 변수는 스택 영역에 있으므로 서로 같음.
		
		String sVal5 = null;
		String sVal6 = null;
		System.out.println("sVal5==sVal6 : " + (sVal5==sVal6 ? "참조가 같다" : "참조가 다르다"));
//		System.err.println("sVal5의 길이 : " + sVal5.length());
		
		sVal5 = "Java";
		System.out.println("sVal1==sVal5 : " + (sVal1==sVal5 ? "참조가 같다" : "참조가 다르다"));
		
		// String 객체가 동일한 문자열을 가지고 있는지 비교하는 경우
		// 반드시 equals() 메서드를 사용
		
		if(sVal3.equals(sVal4)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}
}
