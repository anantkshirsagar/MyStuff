package com.collections_and_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(13, 45, -1, 4, 40);
		Collections.sort(list);
		System.out.println(list);
		
		Integer min = Collections.min(list);
		System.out.println(" Min element: " +min);
		
		Integer max = Collections.max(list);
		System.out.println(" Max element: " +max);
		
		Collections.shuffle(list);
		System.out.println(" After shuffling: " +list);
		
		Collections.sort(list);
		System.out.println(" Sorted: " +list);
		
		
		Collections.reverse(list);
		System.out.println(" Reverse: " +list);
		
		int binarySearch = Collections.binarySearch(list, 45);
		System.out.println(" Search element index: " +binarySearch);
		
	}
}
