package week07;

public class PetEx {
	public static void main(String[] args) {
		Pet pet1 = new Pet("구름", "강아지", 2, "흰색");
		Pet pet2 = new Pet("바둑이", "강아지", 3);
		Pet pet3 = new Pet("초코", "고양이");
		
		System.out.println("< 애완동물 정보 >");
		System.out.printf("이름 : %s\n종류 : %s\n나이 : %d살\n색상 : %s\n", pet1.name, pet1.type, pet1.age, pet1.color);
		System.out.printf("이름 : %s\n종류 : %s\n나이 : %d살\n색상 : %s\n", pet2.name, pet2.type, pet2.age, pet2.color);
		System.out.printf("이름 : %s\n종류 : %s\n나이 : %d살\n색상 : %s\n", pet3.name, pet3.type, pet3.age, pet3.color);
	}
}
