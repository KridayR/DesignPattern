package com.learning.structural.composition.adapter;

public class RectangularPlug {

	private CylindricalSocket cylindricalSocket;

	public void adptee(String rectangularStem1, String rectangularStem2) {
		cylindricalSocket = new CylindricalSocket();
		String cylindricalStem1 = rectangularStem1;
		String cylindricalStem2 = rectangularStem2;

		cylindricalSocket.supplyPower(cylindricalStem1, cylindricalStem2);
	}

}
