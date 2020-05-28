package com.learning.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroyTest {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Refection::");

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		System.out.println(instance1.hashCode());

		BillPughSingleton instance2 = null;
		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (BillPughSingleton) constructor.newInstance();
			break;

		}
		System.out.println(instance2.hashCode());
		
		System.out.println("Serialization::");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
		oos.writeObject(instance1);
		oos.close();
		
		System.out.println(instance1.hashCode());
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
		BillPughSingleton deserializedObj = (BillPughSingleton) ois.readObject();
		
		System.out.println(deserializedObj.hashCode());
		

		

	}

}
