package com.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static List<Integer> getSquares(List<Integer> numbers) {
		// List<Integer> squares = numbers.stream().map(x ->
		// x*x).collect(Collectors.toList());
		return numbers.stream().map(x -> x * x).collect(Collectors.toList());
	}

	public static List<String> filterStrByPrefix(List<String> stringList, String prefix) {
		// List<String> strList = stringList.stream().filter(str ->
		// str.startsWith(prefix)).collect(Collectors.toList());
		// return strList;

		return stringList.stream().filter(str -> str.startsWith(prefix)).collect(Collectors.toList());
	}

	public static List<Integer> sort(List<Integer> integers){
		return integers.stream().sorted().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(4, 5, 6, 1, 2, 3);
		List<Integer> squares = getSquares(integers);
		System.out.println(" Squares list: " + squares);
		// squares.forEach(no -> System.out.println(no));

		List<String> stringList = Arrays.asList("Anant", "Suyog", "Pranav", "Sonali");
		String prefix = "P";
		List<String> filteredStringList = filterStrByPrefix(stringList, prefix);
		System.out.println(" Filterd string list by [P]: " + filteredStringList);

		List<Integer> sorted = sort(integers);
		System.out.println(" Sorted integers: " +sorted);
	}
}
