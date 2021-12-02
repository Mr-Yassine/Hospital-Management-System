package com.hospital.models;

import java.util.*;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.OperationType;

public class Patient extends Person{

	private Date hospitalEntryDate;
	private String affiliationNumber;
	private InsuranceType insuranceType;







	public Patient(){}
	public Patient(String firstname,String lastname,String phone,String address,Date hospitalEntryDate,String affiliationNumber,InsuranceType insuranceType) {
		super(firstname,lastname, phone, address);
		this.hospitalEntryDate = hospitalEntryDate;
		this.affiliationNumber = affiliationNumber;
		this.insuranceType = insuranceType;
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
