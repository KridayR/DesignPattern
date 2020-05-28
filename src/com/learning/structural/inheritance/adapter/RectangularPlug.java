package com.learning.structural.inheritance.adapter;

public class RectangularPlug extends CylindricalSocket {

	public void adptee(String rectangularStem1, String rectangularStem2) {
		String cylindricalStem1 = rectangularStem1;
		String cylindricalStem2 = rectangularStem2;

		this.supplyPower(cylindricalStem1, cylindricalStem2);
	}

}
