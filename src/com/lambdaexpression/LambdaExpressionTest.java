package com.lambdaexpression;

interface MathOperation {
	int operation(int a, int b);
}

public class LambdaExpressionTest {
	public static void main(String[] args) {
		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		
		//without type declaration
		MathOperation subtraction = (a, b) ->  a - b;
		
		//with return statement
		MathOperation multiply = (a, b) -> {return a*b;};
		
		//without return statement
		MathOperation division = (int a, int b) -> a / b;
		
		LambdaExpressionTest lambdaTest = new LambdaExpressionTest();
		System.out.println(" 10 + 5: " +lambdaTest.operate(10, 5, addition));
		System.out.println(" 10 - 5: " +lambdaTest.operate(10, 5, subtraction));
		System.out.println(" 10 * 5: " +lambdaTest.operate(10, 5, multiply));
		System.out.println(" 10 / 5: " +lambdaTest.operate(10, 5, division));
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
