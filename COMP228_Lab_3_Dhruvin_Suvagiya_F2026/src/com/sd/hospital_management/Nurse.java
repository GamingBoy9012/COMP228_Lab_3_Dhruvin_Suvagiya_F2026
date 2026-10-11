package com.sd.hospital_management;

public class Nurse extends Person {
	private int department;
	private String shift;
	
	public Nurse(int personId, String name, int age, int department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	public void assistPatient()
	{
		System.out.println(name + " is assisting patients" );
	}
	
	public void performDuties()
	{
		System.out.println(name + " is performing nurse's duties");
	}
	
	public void details()
	{
		System.out.println("Id: " + personId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Department No. " + department);
		System.out.println("Shift type: " + shift);
	}
}
