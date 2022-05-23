package com.lamichhane.deep.cloning.example;

public class DeepCloaningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {


		Cat c = new Cat(10);
		Dog d = new Dog(20,c);
		Dog d2 =  (Dog)d.clone();
		
		System.out.println("Orginal Cat Object I Value="+c.i);
		System.out.println("Orginal Dog Object J Value="+d.j);
		System.out.println("Orginal Dog Object Cat c value="+d.c.i);
		
		d2.j = 200;
		d2.c.i = 100;
		
		System.out.println();
		System.out.println("Modifying The Reference Value");
		System.out.println("Orginal Cat Object I Value="+c.i);
		System.out.println("Orginal Dog Object J Value="+d2.j);
		System.out.println("Orginal Dog Object Cat c value="+d2.c.i);
		
		System.out.println();
		System.out.println("Changed value effected in d object too="+d.c.i);
		
		
		

	}

}
