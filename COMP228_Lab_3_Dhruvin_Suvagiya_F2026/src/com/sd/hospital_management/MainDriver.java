package com.sd.hospital_management;

public class MainDriver {

	public static void main(String[] args) {
		
		Person person;
		System.out.println("\n--- Doctor ---");
		Doctor doctor = new Doctor(9012, "A", 30, "Doctor", 550);
		person = new Doctor(9012, "A", 30, "Doctor", 550);
		doctor.details();
		doctor.diagnosePatient();
		
		//polymorphism
		person.performDuties();
		
		
		System.out.println();
		System.out.println("\n--- Nurse ---");
		Nurse nurse = new Nurse(1111, "B", 26, 4, "Night");
		person = new Nurse(1111, "B", 26, 4, "Night");
		nurse.details();
		nurse.assistPatient();
		
		//polymorphism
		person.performDuties();
		
		System.out.println();
		System.out.println("\n--- Surgeon ---");
		Surgeon surgeon = new Surgeon(2222, "C", 30, "Surgeon", 1000, "Heart", 55);
		person = new Surgeon(2222, "C", 30, "Surgeon", 1000, "Heart", 55);
		surgeon.details();
		surgeon.performSurgery();
		
		//polymorphism
		person.performDuties();
		
		System.out.println("\n--- Emergency Doctor ---");
		EmergencyDoctor e_doct = new EmergencyDoctor(3333, "D", 40, "Emergency Doctor", 2000);
		person = new EmergencyDoctor(3333, "D", 40, "Emergency Doctor", 2000);
		e_doct.details();
		e_doct.handleEmergency();
		e_doct.prescribeMedication();
		e_doct.generateBill();
		
		//polymorphism
		person.performDuties();
	}
}
