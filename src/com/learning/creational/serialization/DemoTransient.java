package com.learning.creational.serialization;

import java.io.Serializable;

public class DemoTransient implements Serializable {
	private static final long serialVersionUID = 1L;
	transient int a;
	static int b;
	String name;
	int age;

// Default constructor 
	public DemoTransient(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "DemoTransient [a=" + a + ", name=" + name + ", age=" + age + "]";
	}

}
