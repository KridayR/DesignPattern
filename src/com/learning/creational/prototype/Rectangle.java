package com.learning.creational.prototype;

public class Rectangle extends Shape {	

	public Rectangle() {
		this.type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle::::");
	}

}
