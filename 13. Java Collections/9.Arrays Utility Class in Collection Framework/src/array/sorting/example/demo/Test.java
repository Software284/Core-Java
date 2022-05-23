package array.sorting.example.demo;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	
		 int[] a = {10,5,20,11,6};
		 System.out.println("Primitive Array before sorting:");
		 for( int a1: a) {
			 System.out.println(a1);
		 }
		 Arrays.sort(a);
		 System.out.println("Primitive Array After sorting:");
		 for(int a1: a) {
			 System.out.println(a1);
		 }
		 
		 String[] s = {"A","Z","B"};
		 System.out.println("Objects Array before sorting:");
		 for(String s1: s) {
			 System.out.println(s1);
		 }
		 Arrays.sort(s);
		 System.out.println("Objects Array After sorting:");
		 for(String s1: s) {
			 System.out.println(s1);
		 }
		 
		 Arrays.sort(s,new MyComparator());
		 System.out.println("Objects Array After sorting by comparator:");
		 for(String s1: s) {
			 System.out.println(s1);
		 }

	}

}
