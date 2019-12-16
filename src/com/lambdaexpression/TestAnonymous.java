package com.lambdaexpression;

interface Test{
	void print();
}

public class TestAnonymous {
	
	public static void callToTest(Test test) {
		test.print();
	}
	
	public static void main(String[] args) {
		callToTest(() -> System.out.println("Hello Omniscient"));
	}
}
