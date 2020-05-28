package com.learning.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton obj;

	private ThreadSafeSingleton() {
		super();
	}

	public static ThreadSafeSingleton getInstance() {
		synchronized (ThreadSafeSingleton.class) {
			if (obj == null) {
				obj = new ThreadSafeSingleton();
			}
		}
		return obj;
	}

}
