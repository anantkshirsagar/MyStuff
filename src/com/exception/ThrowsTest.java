package com.exception;

class A {
	public void display() throws Exception {
		Object obj;
	}
}

class B extends A {
//	@Override
	public void display1() {
		try {
			
		} catch (Exception e) {
			System.out.println(" EX: " + e);
			return;
		} finally {
			
			System.exit(0);
			
		}
	}

}

public class ThrowsTest {
	public static void main(String... args) {
		try {
			throw new ArithmeticException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" EX: " + e);
		} catch (ArithmeticException e) {
			System.out.println(" EX: " + e);
		}
		System.out.println(" I am here");
	}
}
