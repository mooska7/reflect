package com.klt.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {
	public String add(int x){
		System.out.println("add");
		return "add";
	}
	public void minu(int y){
		System.out.println("minu");
	}
	
	public static void main(String[] args) {
		try {
			Class<?> classType = Class.forName("com.klt.reflect.MethodDemo");
			Method addMethod = classType.getMethod("add", new Class[]{int.class});
			System.out.println(addMethod.toString());
			//如何使用这个方法
			Object obj = classType.newInstance();//目标对象
			Object result = addMethod.invoke(obj, new Object[]{1});//执行
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
