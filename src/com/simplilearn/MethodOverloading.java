package com.simplilearn;

public class MethodOverloading {
	
	public void Sum(int a, int b) {
		int result=a+b;
		System.out.println("Sum is "  +result);
		
	}
	public void Sum(int a, int b, int c){
		int result=a+b+c;
		System.out.println("Sum is " +result);
		
	}

}
