package com.learning.creational.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {

		// Serialize & DeSeialize
		/*
		 * Demo object = new Demo(1, "Hai"); String filename = "file.ser";
		 * serializeObj(object, filename);
		 * 
		 * Demo object1 = null; Demo desrializeObj = (Demo) deSerialize(object1,
		 * filename);
		 * 
		 * System.out.println("Object has been deserialized ");
		 * System.out.println(desrializeObj.toString());
		 */

		// Trasient
		/*
		 * DemoTransient demoTransientObj = new DemoTransient("ab", 20, 2, 1000); String
		 * filename1 = "transient.txt"; serializeObj(demoTransientObj, filename1);
		 * System.out.println("Object has been deserialized ");
		 * 
		 * DemoTransient demoTransient = null;
		 * 
		 * demoTransient = (DemoTransient) deSerialize(demoTransient, filename1);
		 * 
		 * System.out.println("Transient Object has been deserialized ");
		 * System.out.println(demoTransient.toString());
		 */

		// Inheritance Serialization
		
		/*
		 * Vehicle twoWheeler = new TwoWheeler("150cc", "disk", "Hallogen", "2 seater");
		 * String filename2 = "inhertance.txt";
		 * 
		 * serializeObj(twoWheeler, filename2);
		 * System.out.println("Object has been serialized ");
		 * 
		 * Vehicle deserializeTwoWheeler = null; deserializeTwoWheeler = (Vehicle)
		 * deSerialize(deserializeTwoWheeler, filename2);
		 * System.out.println("Inheritance Object has been deserialized ");
		 * System.out.println(deserializeTwoWheeler.toString());
		 */

		// Inheritance1 Serialization

		
		  Parent parent = new Child(10, 20, 30); String filename3 = "inhertance1.txt";
		  
		  serializeObj(parent, filename3);
		  System.out.println("Object has been serialized ");
		  
		  Parent deserializeparent = null; deserializeparent = (Parent)
		  deSerialize(deserializeparent, filename3);
		  System.out.println("Inheritance Object has been deserialized ");
		  System.out.println(deserializeparent.toString());
		 

	}

	private static void serializeObj(Object object, String filename) {

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fos);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			fos.close();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}

	private static Object deSerialize(Object object1, String filename) {
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = in.readObject();

			in.close();
			file.close();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
		return object1;
	}

}
