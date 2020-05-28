package com.learning.creational.serialization;

public class Parent {

	private int i;
	private int j;

	public Parent(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Parent [i=" + i + ", j=" + j + "]";
	}

}
