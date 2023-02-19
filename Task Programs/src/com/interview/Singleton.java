package com.interview;

/*
 *  Advantages : Saves memory because object is not created at each request. 
 * Only single instance is reused again and again.
 * 
 * Design pattern :Singleton pattern is mostly used in multi-threaded and database applications. 
 * It is used in logging, caching, thread pools, configuration settings etc.
 */

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		// create the object
	}

	public static Singleton getInstance() {
		if (null == singleton) {
			singleton = new Singleton();
		}

		return singleton;
	}

}
