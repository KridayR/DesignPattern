package com.learning.creational.prototype;

public class Hexagon extends Shape {	

	public Hexagon() {
		this.type = "Hexagon";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Hexagon::::");
	}

}
