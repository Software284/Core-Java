package example.of.leap.year;

import java.time.Year;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Year");
		int x = sc.nextInt();
		
		Year y = Year.of(x);
		if(y.isLeap()) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}

	}

}
