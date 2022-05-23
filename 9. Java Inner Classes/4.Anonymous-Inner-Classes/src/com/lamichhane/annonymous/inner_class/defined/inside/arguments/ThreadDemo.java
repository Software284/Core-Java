package com.lamichhane.annonymous.inner_class.defined.inside.arguments;

public class ThreadDemo {
	public static void main(String args[]){
		Thread t = new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<=10;i++){
					System.out.println("Child Thread");
				}
			}
		});
		t.start();
		
		for(int i=0;i<=10;i++){
		 	System.out.println("Main Thread");
		}
		
	}
}
