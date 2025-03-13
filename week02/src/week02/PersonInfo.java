package week02;

public class PersonInfo {
	public static void main(String[] args) {
		String name = "김시현";
		int age = 27;
		double height = 167.4;
		char gender = 'M';
		boolean isStudent = true;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("성별 : %c\n", gender);
		System.out.printf("학생 여부 : %b", isStudent);
	}
}
