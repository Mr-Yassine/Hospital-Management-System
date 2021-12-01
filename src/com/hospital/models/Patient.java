package com.hospital.models;

import java.util.*;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.OperationType;

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

		double walletBudget = 22000;
		double cout = 0;
		double rembourse = 0;
		double operationCost = 0;
		String operationName;

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

				System.out.println("\n\nLe cout de cette operation " + OperationType.AO932.getCout() + "DH");
				operationName = OperationType.AO932.getOperationName();
				patient.put("Le nom d'operation ",operationName);


				operationCost = OperationType.AO932.getCout();
				patient.put("Le cout d'operation ",operationCost);
				break;


			case 2:

				System.out.println("\n\nLe cout de cette operation " + OperationType.AS312.getCout() + "DH");
				operationName = OperationType.AS312.getOperationName();
				patient.put("Le nom d'operation ",operationName);


				operationCost = OperationType.AS312.getCout();
				patient.put("Le cout d'operation ",operationCost);
				break;


			case 3:

				System.out.println("\n\nLe cout de cette operation " + OperationType.BJ939.getCout() + "DH");
				operationName = OperationType.BJ939.getOperationName();
				patient.put("Le nom d'operation",operationName);

				operationCost = OperationType.BJ939.getCout();
				patient.put("Le cout d'operation",operationCost);
				break;



			default:
				System.out.println("\nOperation not found");
		}











		System.out.print("\n\nChoisissez votre type d'assurance:\n");
		System.out.print("1- CNSS\n" +
				"2- RAMED\n" +
				"3- CNOPS\n");

		int choix = scan.nextInt();

		switch(choix) {
			case 1:

				System.out.println("\nVous devez payez " + operationCost + "DH");


				rembourse = (operationCost * InsuranceType.CNSS.getRembourse())/100;
				System.out.println("L'assurance va te rembourser avec : " + rembourse + "DH");


				patient.put("Type d'assurance",InsuranceType.CNSS.getValue());
				patient.put("Pourcentage du remboursement ",InsuranceType.CNSS.getRembourse() + "%");
				patient.put("Remboursement ",rembourse + "DH");
				break;


			case 2:

				cout = (operationCost * 20)/100;
				System.out.println("\nVous devez payez seulement " + cout + "DH");


				patient.put("insuranceType",InsuranceType.RAMED.getValue());
				break;


			case 3:

				System.out.println("\nVous devez payez " + operationCost + "DH");

				rembourse = (operationCost * InsuranceType.CNOPS.getRembourse())/100;
				System.out.println("L'assurance va te rembourser avec : " + rembourse + "DH");


				patient.put("Type d'assurance ",InsuranceType.CNOPS.getValue());
				patient.put("Pourcentage du remboursement ",InsuranceType.CNSS.getRembourse() + "%");
				patient.put("Remboursement ",rembourse + "DH");
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

			patient.put("Prenom ",this.getFirstname());
			patient.put("Nom ",this.getLastname());
			myPatients.add(patient);


			System.out.println("\n\nVoila un rapport qui resume votre operation \n" +
					myPatients
					);

		} else {
			System.out.println("\nVous n'avez pas assez d'argent pour effectuer cette operation");
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
