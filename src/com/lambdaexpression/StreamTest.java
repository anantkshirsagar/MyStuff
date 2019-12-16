package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Student> studentList = getStudentList();
		// Filter students where percentage > 70.0f using stream api
		long startTime = System.nanoTime();
		List<Student> filterStudentUsingStream = filterStudentUsingStream(studentList);
		long totalTime = System.nanoTime() - startTime;

		System.out.println("Execution time: " + TimeUnit.SECONDS.convert(totalTime, TimeUnit.SECONDS));
		System.out.println(filterStudentUsingStream);
		
		startTime = System.nanoTime();
		List<Student> filteredStudents = filterStudentWithoutStream(studentList);
		totalTime = System.nanoTime() - startTime;
		System.out.println("----------------------------------------------------------");
		System.out.println("Execution time: " + TimeUnit.SECONDS.convert(totalTime, TimeUnit.SECONDS));
		System.out.println(filteredStudents);
	}

	public static List<Student> filterStudentUsingStream(List<Student> studentList) {
		return studentList.stream().filter(student -> student.getPercentage() > 70.0f).collect(Collectors.toList());
	}

	public static List<Student> filterStudentWithoutStream(List<Student> studentList) {
		List<Student> filteredStudents = new ArrayList<Student>();
		for (Student student : studentList) {
			if (student.getPercentage() > 70.0f) {
				filteredStudents.add(student);
			}
		}
		return filteredStudents;
	}

	public static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "AAAA", 60.0f));
		studentList.add(new Student(102, "BBBB", 70.0f));
		studentList.add(new Student(103, "CCCC", 65.0f));
		studentList.add(new Student(104, "DDDD", 75.0f));
		studentList.add(new Student(105, "EEEE", 45.0f));
		studentList.add(new Student(106, "FFFF", 66.0f));
		studentList.add(new Student(107, "GGGG", 56.0f));
		studentList.add(new Student(108, "HHHH", 76.0f));
		studentList.add(new Student(109, "JJJJ", 50.0f));
		studentList.add(new Student(110, "LLLL", 79.0f));
		studentList.add(new Student(111, "MMMM", 76.0f));
		studentList.add(new Student(112, "NNNN", 87.0f));
		studentList.add(new Student(113, "KKKK", 47.0f));
		studentList.add(new Student(114, "QQQQ", 59.0f));
		studentList.add(new Student(115, "ZZZZ", 89.0f));
		return studentList;
	}
}
