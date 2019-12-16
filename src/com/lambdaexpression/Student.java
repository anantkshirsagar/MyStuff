package com.lambdaexpression;

public class Student {
	private int rollNo;
	private String name;
	private float percentage;

	public Student(int rollNo, String name, float percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollNo=");
		builder.append(rollNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
}
