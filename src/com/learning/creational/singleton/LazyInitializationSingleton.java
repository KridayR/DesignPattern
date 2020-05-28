package com.learning.creational.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton obj;
	
	private LazyInitializationSingleton() {
		super();
	}


	public static LazyInitializationSingleton getInstance() {
		if (obj == null) {
			obj = new LazyInitializationSingleton();
			return obj;
		} else {
			return obj;
		}
	}

}
