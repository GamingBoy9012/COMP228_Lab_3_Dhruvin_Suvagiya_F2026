package com.sd.hospital_management;

public class Surgeon extends Doctor {
	private String surgeryType;
	private int operatingRoom;
	
	public Surgeon(int personId, String name, int age, String specialization, float consultationFee, String surgeryType,
			int operatingRoom) {
		super(personId, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	public void performSurgery()
	{
		System.out.println(name + " is performing surgery");
	}
	
	public void performDuties()
	{
		System.out.println(name + " is performing surgeon's duties");
	}
	
	public void details()
	{
		System.out.println("ID: " + personId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Specialization: " + specialization);
		System.out.println("Consultation Fees: " + consultationFee);
		System.out.println("Surgery Type: " + surgeryType);
		System.out.println("Operating Room No.: " + operatingRoom);
	}
	
	
}
