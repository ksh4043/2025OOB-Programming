package week07;

public class Pet {
	String name;
	String type;
	int age;
	String color;
	
	Pet(String name, String type){
		this.name = name;
		this.type = type;
		this.age = 5;
		this.color = "미정";
	}
	
	Pet(String name, String type, int age){
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = "미정";
	}
	
	Pet(String name, String type, int age, String color){
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
}
