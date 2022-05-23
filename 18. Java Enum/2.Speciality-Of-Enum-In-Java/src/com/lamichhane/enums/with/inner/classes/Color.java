package com.lamichhane.enums.with.inner.classes;

public enum Color {
	
	RED{
		public void info() {
			System.out.println("Dangerious Color");
	}
	},BLUE,GREEN;
	
	public void info() {
		System.out.println("Universal Color");
	}

}
