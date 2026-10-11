package com.sd.hospital_management;

public class EmergencyDoctor extends Doctor 
	implements MedicalProfessional, Billable{
	
	
	public EmergencyDoctor(int personId, String name, int age, String specialization, float consultationFee) {
		super(personId, name, age, specialization, consultationFee);
		// TODO Auto-generated constructor stub
	}

	public void handleEmergency()
	{
		System.out.println(name + " is handling Emergency cases.");
	}
	
	@Override
    public void performDuties() {
        System.out.println(name + " is performing duties");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(name + " is prescribing medication");
    }
    
    @Override
    public void generateBill()
    {
    		System.out.println(name + " generated a bill");
    }
    
    public void details()
    {
    		System.out.println("ID: " + personId);
    		System.out.println("Name: " + name);
    		System.out.println("Age: " + age);
    		System.out.println("Specialization: " + specialization);
    		System.out.println("Consultation Fees: " + consultationFee);
    }
}

