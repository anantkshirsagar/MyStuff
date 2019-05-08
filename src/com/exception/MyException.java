package com.exception;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

class Student {
	int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
//		return this.rollNo+"";
		return String.valueOf(rollNo);
	}
}

public class MyException {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new StringBuilder("Pranav"));
		list.add(10);
		list.add(new Exception());

		List<String> str = new ArrayList<String>();
		List<?> list1 = null;

		int a = 10;
		if (a > 0) {
			list1 = new ArrayList<String>();
		} else {
			list1 = new ArrayList<Integer>();
		}

//		for (Object object : list) {
//			System.out.println(object);
//		}

//		int a = 10;
//		List<Integer> intList = new ArrayList();
//		list.add(a);
//
//		Integer b = 10;
//		int c = b;
//
//		out.println(" Hello Java");
	}
}
