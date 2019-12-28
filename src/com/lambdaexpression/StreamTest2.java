package com.lambdaexpression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		List<Integer> numbers = getNumbers();	// List of 1 to 100 Lakh
		findSquareRootUsingStream(numbers);
		findSquareRootUsingLoop(numbers);
	}

	public static void findSquareRootUsingStream(List<Integer> numbers) {
		Stream<Integer> stream = numbers.stream();
		List<Double> result = new LinkedList<>();
		long startTime = System.nanoTime();
		stream.filter(no -> no % 2 == 0).map(no -> Math.sqrt(no)).collect(Collectors.toList());
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Stream:   Execution time: " + totalTime + " ns");
	}

	public static void findSquareRootUsingLoop(List<Integer> numbers) {
		List<Double> squares = new LinkedList<Double>();
		long startTime = System.nanoTime();
		for (Integer no : numbers) {
			if (no % 2 == 0) {
				squares.add(Math.sqrt(no));
			}
		}
		long totalTime = System.nanoTime() - startTime;
		System.out.println("For loop: Execution time: " + totalTime + " ns");
	}

	public static List<Integer> getNumbers() {
		int min = 1;
		int max = 10000000;
		List<Integer> numbers = new ArrayList<>();
		for (int i = min; i < max; i++) {
			numbers.add(i);
		}
		return numbers;
	}
}
