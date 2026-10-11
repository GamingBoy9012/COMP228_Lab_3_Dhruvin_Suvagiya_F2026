package com.sd.hospital_management;

public class Person {
    protected int personId;
    protected String name;
    protected int age;
	
	public Person ( int personId, String name, int age)
	{
		this.personId = personId;
		this.age = age;
		this.name = name;
	}
	
	
	
	public void performDuties()
	{
		System.out.println(name + " is performing duties");
	}
	
	
}
