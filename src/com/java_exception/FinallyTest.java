package com.java_exception;

public class FinallyTest {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println(" Finally ");
		}
//		throw new ArrayIndexOutOfBoundsException();
//		System.out.println("finally");
	}
}
