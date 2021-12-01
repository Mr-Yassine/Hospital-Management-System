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
		int walletBudget = 25000;


		Scanner scan = new Scanner(System.in);


		// Create a HashMap object called Doctor
		HashMap patient = new HashMap<>();





		do {


			System.out.print("Enter the First Name:");
			this.setFirstname(scan.nextLine());

			System.out.print("Enter the Last Name:");
			this.setLastname(scan.nextLine());


			System.out.print("Choisissez votre type d'assurance:\n");
			System.out.print("1- CNSS\n" +
					"2- RAMED\n" +
					"3- CNOPS");

			int choix = scan.nextInt();

			switch(choix) {
				case 1:

					System.out.println("Vous devez payez seulement 30%");
					patient.put("insuranceType","CNSS");
					break;


				case 2:

					System.out.println("Vous devez payez seulement 30%");
					patient.put("insuranceType","RAMED");
					break;


				case 3:

					System.out.println("Vous devez payez seulement 30%");
					patient.put("insuranceType","CNOPS");
					break;

				default:
					// code block
			}


			patient.put("fName",this.getFirstname());
			patient.put("lName",this.getLastname());
			myPatients.add(patient);





		} while (Budget);

		System.out.println(myPatients);
	}


	public void showPatient(){
		System.out.println("\n" + myPatients);
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
