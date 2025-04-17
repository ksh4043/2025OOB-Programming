package week06;

import java.util.List;

public class ReferenceString {

	public static void main(String[] args) {
		String ssn = "9909251234567";
		
		// 문자열은 0번부터 인덱스를 가짐
		// 한개의 문자 추출
		char gender = ssn.charAt(6);
		
		switch (gender) {
		case '1', '3': {
			System.out.println("임마 남자노");
			break;
		}
		case '2', '4':
			System.out.println("임마 딸래미노");
			break;
		default:
			System.out.println("닌 머냐??");
			break;
		}
		
		// 문자열의 길이
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 제대로 입력했네~");
		}else {
			System.out.println("닌 진짜 머냐? 머 외계인이가?");
		}

		
		// 문자열 대체
		String oldStr = "Java Programming";
		String newStr = oldStr.replace("Java", "자바");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// 문자열 잘라내기(추출하기, 일부분 가져오기)
		String birth = ssn.substring(0, 6);
		System.out.println("네놈의 생년월일은 : " + birth + " 이구나 ㅋㅋ");
		
		String secondNum = ssn.substring(6);
		System.out.println("주민번호 뒷자리 털렸음 ㅅㄱㅋㅋ~ : " + secondNum);
		
		// 문자열 찾기
		// String oldStr = "자바 프로그래밍";
		// indexOf : 특정 단어가 문자열에서 시작되는 인덱스 값을 반환
		int index = oldStr.indexOf("Programming");
		
		// 찾고자 하는 단어가 문자열 안에 없는 경우 : -1 return
		if (index == -1) {
			System.out.println("Programming 단어가 어딨는데~");
		}else {
			System.out.println("Programming 요있네ㅋㅋ : " + index);
		}
		
		// 문자열 포함 여부 : contains() => true or false
		boolean result = oldStr.contains("자바");
		if(result) {
			System.out.println("자바 있대이~");
		}else {
			System.out.println("자바 읎대이~");
		}
		
		// 문자열 분리 : split()
		String board = "1,자바학습,참조타입,String 클래스,홍길동";
		String[] splitWord = board.split(",");
		for(int i = 0; i < splitWord.length; i++) {
			System.out.printf("%d번째 단어가 궁금해?ㅋㅋ %s이야 임마~\n", (i+1), splitWord[i]);
		}
		
		// 향상된 for문 사용
		for(String term : splitWord) {
			System.out.println(term);
		}
	}

}
