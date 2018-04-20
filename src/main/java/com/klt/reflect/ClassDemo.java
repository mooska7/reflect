package com.klt.reflect;

import java.lang.reflect.Method;

public class ClassDemo {
	public static void main(String[] args) {
		try {
			Class<?> classType = Class.forName(args[1]);
			Method[] methods = classType.getDeclaredMethods();
			for(Method method:methods){
				System.out.println(method.toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
