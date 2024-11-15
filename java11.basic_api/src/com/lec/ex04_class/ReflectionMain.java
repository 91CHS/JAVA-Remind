package com.lec.ex04_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    	2. Class정보얻기(Reflection)
 	
 		getDeclareConstructors(), getDeclaredFields(), getDeclareMethods() 등의 메서드를
 		이용해서 해당 클래스의 필드, 생성자, 메서드에 대한 정보를 알 수가 있다.
 		이것을 리플렉션(Reflection)
 */
public class ReflectionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class _class = Class.forName("java.lang.String");
		//_class = Class.forName("com.lec.ex04_class.Car");
		
		// 1. 클래스의 정보
		System.out.println("1. 클래스 이름");
		System.out.println(_class.getName());
		System.out.println();
		
		// 2. 생성자의 정보
		System.out.println("2. 생성자정보");
		 Constructor[] constructors =_class.getDeclaredConstructors(); // getDeclaredConstructors 쓰려고 배열에 담기. 임폴트.
		 for (Constructor constructor:constructors) {
			 System.out.print(constructor.getName() + "(");
			 Class[] parameters = constructor.getParameterTypes(); // getParameterTypes 쓰려고 배열에 담기
			 printParameter(parameters);
			 System.out.println(")");
		 }
		System.out.println();
		
		
		// 3. 메서드의 정보
		System.out.println("3. 메서드정보");
		Method[] methods = _class.getDeclaredMethods();
		for(Method method:methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 4. 필드의 정보
		System.out.println("4. 필드정보");
		Field[] fields = _class.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
	}

	private static void printParameter(Class[] parameters) {
		
		for(int i=0;i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if (i<parameters.length-1) {
				System.out.print(",");
			}
		}
		
	}

}
