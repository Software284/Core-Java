package com.lamichhane.java.number.to.italy.specific.currency;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
	
		double d = 123456.789;
		
		Locale india = new Locale("en","IN");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
		System.out.println("India  Specific Currency="+nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US  Specific Currency="+nf2.format(d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK  Specific Currency="+nf3.format(d));
		
		//nf3.setMaximumFractionDigits(3);
		//nf3.setMinimumFractionDigits(2);
		//nf3.setMaximumIntegerDigits(2);
		//nf3.setMinimumIntegerDigits(2);

	}

}
