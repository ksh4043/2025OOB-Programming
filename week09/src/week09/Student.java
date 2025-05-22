package week09;

public class Student {
	String name;
	int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getTotal() {
		return kor + eng + mat;
	}
	
	public double getAve() {
		return (double)getTotal() / 3;
	}
}
