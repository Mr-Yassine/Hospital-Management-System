package com.hospital.models;
import java.util.*;

public class Doctor extends Person{

	private String professionNumber;
	private TimeSlot shiftSlot;
	private double salary;
	HashMap doctor;
	List<HashMap> myDoctors;

	public Doctor(){
		doctor = new HashMap<>();
		myDoctors = new ArrayList<>();
	}

	public Doctor(String firstname,String lastname,String phone,String address, String professionNumber,TimeSlot shiftSlot,double salary) {
		super(firstname,lastname, phone, address);
		this.professionNumber = professionNumber;
		this.shiftSlot = shiftSlot;
		this.salary = salary;
	}




	public void addDoctor() {

		String answer;
		boolean loopAgain = true;


		Scanner scan = new Scanner(System.in);


		// Create a HashMap object called Doctor





		do {


			System.out.print("\nEnter the First Name:");
			this.setFirstname(scan.nextLine());

			System.out.print("Enter the Last Name:");
			this.setLastname(scan.nextLine());



			System.out.print("Enter the profession number:");
			professionNumber = scan.nextLine();



			doctor.put("fName",this.getFirstname());
			doctor.put("lName",this.getLastname());
			doctor.put("professionNumber",professionNumber);
			myDoctors.add(doctor);

			//System.out.print(doctor);


			System.out.print("\n\nEnter another doctor (y/n)?");
			answer = scan.nextLine();




			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}


		} while (loopAgain);
		//scan.close();

		System.out.println(myDoctors);
	}




	public String getProfessionNumber() {
		return professionNumber;
	}
	public void setProfessionNumber(String professionNumber) {
		this.professionNumber = professionNumber;
	}


	public TimeSlot getShiftSlot() {
		return shiftSlot;
	}
	public void setShiftSlot(TimeSlot shiftSlot) {
		this.shiftSlot = shiftSlot;
	}


	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Doctor [professionNumber=" + professionNumber + ", shiftSlot=" + shiftSlot + ", salary=" + salary + "]";
	}
	
}
