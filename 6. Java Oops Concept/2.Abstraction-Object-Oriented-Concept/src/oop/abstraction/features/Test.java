package oop.abstraction.features;

public class Test {

	public static void main(String[] args) {
		
		Person p1 = new Student();
		p1.display();
		Person p2 = new Lecturer();
		p2.display();

	}

}
