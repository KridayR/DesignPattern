package com.learning.creational.serialization;

import java.io.Serializable;

public class Child extends Parent implements Serializable {

	private static final long serialVersionUID = 1L;
	private int x;

	public Child(int i, int j, int x) {
		super(i, j);
		this.x = x;
	}

	@Override
	public String toString() {
		return "Child [x=" + x + super.toString() + "]";
	}

}
