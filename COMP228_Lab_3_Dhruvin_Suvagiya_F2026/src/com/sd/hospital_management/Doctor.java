package com.sd.hospital_management;

public class Doctor extends Person {
	protected String specialization;
    protected float consultationFee;

	public Doctor(int personId, String name, int age, String specialization, float consultationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	public void diagnosePatient()
	{
		System.out.println(name + " is diagnosing patient");
	}
	
	public void performDuties()
	{
		System.out.println(name + " is performing Doctor's duties");
	}
	
	public void details()
	{
		System.out.println("ID " + personId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Specialization: " + specialization);
		System.out.println("Consultation Fees: " + consultationFee);
	}
	
}
