package com.lamichhane.java.number.to.italy.specific.number;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		double d = 123456.789;
		NumberFormat fm = NumberFormat.getInstance(Locale.ITALY);
		String s = fm.format(d);
		System.out.println("Italy Specific Number="+s);
		

	}

}
