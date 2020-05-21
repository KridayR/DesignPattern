package com.learning.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton obj;

	private StaticBlockSingleton() {
		super();
	}

	static {
		try {
			obj = new StaticBlockSingleton();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static StaticBlockSingleton getInstance() {
		return obj;
	}

}
