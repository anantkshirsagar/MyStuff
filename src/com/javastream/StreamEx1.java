package com.javastream;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("RED", "BLACK", "GREEN", "BLUE", "CYAN");
		Stream<String> stream = items.stream();
		List<String> filteredResult = stream.filter(color -> color.contains("E")).collect(Collectors.toList());
//		System.out.println("Output: " +filteredResult);
		
		List<String> numbers = Arrays.asList("1","2","3","4","5","6");
		Stream<Integer> map = numbers.stream().map(no -> Integer.valueOf(no));
		List<Integer> evenNos = map.filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Output: " +evenNos);
	}
}
