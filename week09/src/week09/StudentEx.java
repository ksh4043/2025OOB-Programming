package week09;

public class StudentEx {
	public static void main(String[] args) {
		Student std = new Student("홍길동", 100, 80, 82);
		
		System.out.printf("%s : 총점 %s점, 평균 %.1f점", std.name, std.getTotal(), std.getAve());
	}
}
