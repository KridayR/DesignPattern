package com.learning.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println("Eagerly initialized obj");
		System.out.println(EagerInitializationSingleton.getInstance().hashCode());
		System.out.println(EagerInitializationSingleton.getInstance().hashCode());
		
		System.out.println("Static Block Singleton");
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		
		System.out.println("Lazy initialization Singleton");
		System.out.println(LazyInitializationSingleton.getInstance().hashCode());
		System.out.println(LazyInitializationSingleton.getInstance().hashCode());
		
		System.out.println("Thread safe Singleton");
		System.out.println(ThreadSafeSingleton.getInstance().hashCode());
		System.out.println(ThreadSafeSingleton.getInstance().hashCode());
		
		System.out.println("Bill pugh Singleton");
		System.out.println(BillPughSingleton.getInstance().hashCode());
		System.out.println(BillPughSingleton.getInstance().hashCode());


	}

}
