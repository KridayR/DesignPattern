package com.learning.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String engine;
	private String brake;

	public Vehicle(String engine, String brake) {
		super();
		this.engine = engine;
		this.brake = brake;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", brake=" + brake + "]";
	}

}
