package com.learning.serialization;

public class TwoWheeler extends Vehicle {

	private static final long serialVersionUID = 1L;
	private String headLight;
	private String seat;

	public TwoWheeler(String engine, String brake, String headLight, String seat) {
		super(engine, brake);
		this.headLight = headLight;
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "TwoWheeler [headLight=" + headLight + ", seat=" + seat + "," + super.toString() + "]";
	}

}
