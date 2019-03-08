package com.collections_and_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnnonimousTest {
//	public static List<Integer> sortArray(Integer[] numbers){
//		Arrays.sort(numbers, new Comparator<Integer>(){
//			@Override
//			public int compare(Integer n1, Integer n2) {
//				return (n1 - n2);
//			}
//		});
//		
//		return Arrays.asList(numbers);				
//	}
	
	public static List<Integer> sortArrayWithLambda(Integer[] numbers){
		Arrays.sort(numbers, (a,b) -> (a-b));
		return Arrays.asList(numbers);
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {5,12,0,1,4,2};
		
//		List<Integer> list = sortArray(numbers);
//		System.out.println(list);
		
		List<Integer> list = sortArrayWithLambda(numbers);
		System.out.println(list);
	}
}
