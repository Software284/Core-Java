package com.lamichhane.mobile.no.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
	
		String mobileno= "919293949596";
		
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(mobileno);
		if(m.find() && m.group().equals(mobileno)) {
			System.out.println("Valid Mobile Numbers");
		}
		else {
			System.out.println("Invalid Mobile Numbers");
		}
		

	}

}
