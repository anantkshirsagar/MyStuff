package com.lambdaexpression;

public class ShadowVariableEx {
	String str = "Hello Java";
	
	public void print() {
		String str = "Hello world";
		System.out.println("Local variable: " +str);
		
		System.out.println("Instance variable: " +str);
	}
}
