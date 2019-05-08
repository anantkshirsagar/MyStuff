package com.exception;

public class TestVarArgs {

//	public static int add(int a, int b) {
//		return a + b;
//	}
//
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
	
	public static int add(int[] arr, int b) {
		return 0;
	}
	
	public static int add(int...arr) {
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
//		int a = add(10, 20);
//		int b = add(10, 20, 30);
//		System.out.println(a);
//		System.out.println(b);
		
		add();
		int a = add(1);
		System.out.println(a);
		a = add(1, 2);
		System.out.println(a);
		a = add(1, 2, 3);
		System.out.println(a);
		a = add(1, 2, 3, 4);
		System.out.println(a);
		
		int arr[] = {1,2,3,4,5};
		int add = add(arr);
		System.out.println(add);
		
		int p1 = 10;
		Integer p2 = p1;
		
		
		Integer p3 = 20;
		int p4 = p3;
		
		
	}
}
