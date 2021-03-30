package com.usedClassForName;

import java.lang.reflect.Field;

public class DisplayVal {
	public static void main(String[] args) {
		try {
			
			  Class<?> clazz = Class.forName("com.usedClassForName.User"); 
			  Object instance
			  = clazz.newInstance();
			  Field field = clazz.getDeclaredField("age");
			  field.setAccessible(true); field.set(instance, 25);
			  Object fieldval =
			  field.get(instance);
			 System.out.println(fieldval);
			 
		
			User user=new User();
			System.out.println(user.getAge());
			
			}catch (Exception e) {
				// TODO: handle exception
			}
		
	}

}
