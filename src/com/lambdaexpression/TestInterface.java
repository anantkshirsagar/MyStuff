package com.lambdaexpression;

@FunctionalInterface
public interface TestInterface {
	int i = 10;

	void print();

	static void method1(String message) {
		System.out.println("Static method: " + message);
	}

	default void defaultMethod(String message) {
		System.out.println("Default method: " + message);
	}
}

class MainTestInterface {
	public static void main(String[] args) {
		TestInterface.method1("Hello ");

	}
}