package com.psl.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass testClass = new TestClass();
		Class<?> cls = TestClass.class;

		for (Method m : cls.getDeclaredMethods()) {
			if (m.isAnnotationPresent(TestThis.class)) {
				try {
					m.invoke(testClass);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {

					e.printStackTrace();
				}
			}
		}
	}

}
