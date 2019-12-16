package com.lambdaexpression;

@FunctionalInterface
interface Rectangle {
	void draw();
}

public class TestShape {
	public static void main(String[] args) {
		Rectangle rectangle = () -> System.out.println("Drawing rectangle shape");
		rectangle.draw();
	}
}
