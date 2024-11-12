package com.lec.ex01_object.ex04_clone.thin;

public class Member implements Cloneable{
	// implements Cloneable은 객체복제가 가능하게 하겠다는 의미
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores = {90,88,92};

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
}
