package com.learning.prototype;

public class Rectangle extends Shape {	

	public Rectangle() {
		this.type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle::::");
	}

}
