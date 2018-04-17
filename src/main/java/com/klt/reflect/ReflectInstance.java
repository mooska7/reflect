package com.klt.reflect;

public class ReflectInstance {
	public void add(int x){
		System.out.println("add");
	}
	public void minu(int y){
		System.out.println("minu");
	}
	public static void main(String[] args) {
		try {
			Class<?> classType = Class.forName("com.klt.reflect.ReflectInstance");
			ReflectInstance obj = (ReflectInstance) classType.newInstance();
			obj.add(1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
