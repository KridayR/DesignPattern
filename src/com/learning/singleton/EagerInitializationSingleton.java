package com.learning.singleton;

public class EagerInitializationSingleton {

	private static EagerInitializationSingleton obj = new EagerInitializationSingleton();
	

	private EagerInitializationSingleton() {
		super();
	}


	public static final EagerInitializationSingleton getInstance() {

		return obj;

	}

}
