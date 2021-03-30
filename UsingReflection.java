package com.usedClassForName;

import java.lang.reflect.Field;

public class UsingReflection {
	@SuppressWarnings("deprecation")
	public static void m() {
		try {
		Class<?> clazz = Class.forName("com.usedClassForName.User");
		Object instance = clazz.newInstance();
		Field field = clazz.getDeclaredField("age");
		field.setAccessible(true);
		field.set(instance, 25);
		Object fieldval = field.get(instance);
		System.out.println(fieldval);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
