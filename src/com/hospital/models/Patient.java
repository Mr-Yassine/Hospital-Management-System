package com.hospital.models;

import java.util.*;

import com.hospital.enumerations.InsuranceType;

public class Patient extends Person{

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;



	List<HashMap> myPatients = new ArrayList<>();


	public Patient(){}
	public Patient(Date hospitalEntryDate,String affiliationNumber,InsuranceType insuranceType) {
		super();
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
	}



	public void addPatient() {

		String answer;
		boolean Budget = true;
		double walletBudget = 22000;
		double cout = 0;

		Scanner scan = new Scanner(System.in);


		// Create a HashMap object called Doctor
		HashMap patient = new HashMap<>();













		System.out.print("Choisissez votre operation:\n");
		System.out.print("1- AS312\n" +
				"2- AO932\n" +
				"3- BJ939\n");

		int operation = scan.nextInt();

		switch(operation) {

			case 1:

				System.out.println("\n\nCette operation cout 15000 dh");
				break;


			case 2:

				System.out.println("\n\nCette operation cout 5000 dh");
				break;


			case 3:

				System.out.println("\n\nCette operation cout 82000 dh");
				break;

			default:
				System.out.println("\noperation not found");
		}











		System.out.print("\n\nChoisissez votre type d'assurance:\n");
		System.out.print("1- CNSS\n" +
				"2- RAMED\n" +
				"3- CNOPS\n");

		int choix = scan.nextInt();

		switch(choix) {
			case 1:

				System.out.println("\nVous devez payez seulement 30%");
				patient.put("insuranceType","CNSS");

				cout = (82000 * 30)/100;
				System.out.println("Donc l'operation sa cout : " +cout);
				patient.put("cout",cout);
				break;


			case 2:

				System.out.println("\nVous devez payez seulement 20%");
				patient.put("insuranceType","RAMED");

				cout = (15000 * 20)/100;
				System.out.println("Donc l'operation sa cout : " +cout);
				patient.put("cout",cout);
				break;


			case 3:

				System.out.println("\nVous devez payez seulement 30%");
				patient.put("insuranceType","CNOPS");

				cout = (82000 * 0)/100;
				System.out.println("Donc l'operation sa cout : " +cout);
				patient.put("cout",cout);
				break;

			default:
				System.out.println("operation not found");
		}










		if (walletBudget >= cout) {


			System.out.print("\nEnter the First Name:");
			scan.nextLine();
			this.setFirstname(scan.nextLine());

			System.out.print("Enter the Last Name:");
			this.setLastname(scan.nextLine());

			patient.put("fName",this.getFirstname());
			patient.put("lName",this.getLastname());
			myPatients.add(patient);


			System.out.println("Voila un rapport qui resume votre operation \n" +
					myPatients
					);

		} else {
			System.out.println("\nVous n'avez pas assez d'argent pour effectuer cette operation");
			Budget = false;
		}

	}















	public Date getHospitalEntryDate() {
		return hospitalEntryDate;
	}
	public void setHospitalEntryDate(Date hospitalEntryDate) {
		this.hospitalEntryDate = hospitalEntryDate;
	}



	public String getAffiliationNumber() {
		return affiliationNumber;
	}
	public void setAffiliationNumber(String affiliationNumber) {
		this.affiliationNumber = affiliationNumber;
	}



	public InsuranceType getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}



	@Override
	public String toString() {
		return "Patient [hospitalEntryDate=" + hospitalEntryDate + ", affiliationNumber=" + affiliationNumber
				+ ", insuranceType=" + insuranceType + "]";
	}	
}
