package com.exception;

public class CallingSeq {
	
	final class MYclassd3{
		
	}
	
	static class MyClass{
		
	}
	
	int i;
	static int a;
	
	{
		i = -1;
		System.out.println(" i : " +i);
		System.out.println(" In init block.");
	}

	static {
		System.out.println(" In static block - After");
	}
	
	static {
		int i=0;
		System.out.println(" In static block");
	}
	
	
	
	public CallingSeq() {
		a++;
		System.out.println(" In constructor");
	}
	
	public static void display() {
		System.out.println(" In static display method");
	}
	
	public static void main(String[] args) {
		display();
		CallingSeq callingSeq = new CallingSeq();
		System.out.println(" In main method");
		
		
		String a = "20";
		final int b = 30;
		
		final int z = 0;
		final int y = 20;
//		y = 10;
		
		
		byte k = 1;
		
		switch(k) {
		case 1:
		}
		
		switch(a) {
//		case 0b1011:
//		case 0xa:
//			break;
//		case b:
//		case y:
		case "str":
		default:
			System.out.println(" In default");
		}
		
		
		String str = "abcd";
		str = str.concat("xyz");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("ABC");
		sb.append("XYZ");
		System.out.println(sb);
		
	}
}