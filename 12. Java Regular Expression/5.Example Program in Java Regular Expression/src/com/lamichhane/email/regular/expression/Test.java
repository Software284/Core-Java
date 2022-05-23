package com.lamichhane.email.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
	
		String email= "mahesh@gmail.co.in";
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(email);
		if(m.find() && m.group().equals(email)) {
			System.out.println("Valid Mobile Numbers");
		}
		else {
			System.out.println("Invalid Mobile Numbers");
		}
		

	}

}
