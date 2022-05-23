package com.lamichhane.enums_instance.method.and.variable;

enum Beer {
	KF(90),KO(70),RC(60),AO;
	
	int price;
	
	
	Beer(){
		this.price = 50;
	}
	
	Beer(int price){
		this.price = price;
	}
	
	public int getPrices() {
		return price;
	}
}
