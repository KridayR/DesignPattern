package com.learning.prototype;

public class Square extends Shape {

	public Square() {
		this.type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square ::::::");
	}

}
