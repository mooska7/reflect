package com.klt.reflect;

import java.lang.reflect.Constructor;

public class ConstructDemo {
	private int x;
	public ConstructDemo(){
		
	}
	public ConstructDemo(int x){
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("com.klt.reflect.ConstructDemo");
		Constructor<?> constructor = classType.getConstructor(int.class);
		ConstructDemo demo = (ConstructDemo) constructor.newInstance(6);
		System.out.println(demo.getX());
	}
}
