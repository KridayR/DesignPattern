package com.learning.singleton;

import java.io.Serializable;

public class BillPughSingleton implements Serializable{

	private BillPughSingleton() {
		
	}

	private static class SingletonHelper {
		private static final BillPughSingleton obj = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.obj;
	}
}
