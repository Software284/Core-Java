package oop.encapsulation.features;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Banking APP");
		System.out.println("PRESS 1 FOR SET A BALANCE");
		System.out.println("PRESS 2 FOR GET A BALANCE");
		Account a = new Account();
		
		while(true)
		{
		System.out.println("Enter Your choice = ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
		case 1: 
			a.setBalance(x);
			System.out.println("Balance SET Successfully");
			break;
		case 2: 
			double balance = a.getBalance();
			System.out.println("Balance="+balance);
			break;
		
		default:
			System.out.println("Invalid login");
		}
		}

	}

}
