package com.hospital.Impl;

import com.hospital.interfaces.DoctorInterface;
import com.hospital.models.*;
import javax.print.Doc;
import java.util.*;




public class DoctorImpl implements DoctorInterface {


    Doctor doctors = new Doctor();
    List<HashMap> myDoctors = new ArrayList<>();
    Scanner scan = new Scanner(System.in);








    @Override
    public void addDoctor() {


        String answer;
        boolean loopAgain = true;


        do {

            // Create a HashMap object called Doctor
            HashMap ourDoctor = new HashMap<>();



            System.out.print("\nEnter the First Name:");
            doctors.setFirstname(scan.nextLine());

            System.out.print("Enter the Last Name:");
            doctors.setLastname(scan.nextLine());



            System.out.print("Enter the profession number:");
            doctors.setProfessionNumber(scan.nextLine());



            ourDoctor.put("Prenom",doctors.getFirstname());
            ourDoctor.put("Nom",doctors.getLastname());
            ourDoctor.put("professionNumber",doctors.getProfessionNumber());
            myDoctors.add(ourDoctor);



            System.out.print("\n\nEnter another doctor (y/n)?");
            answer = scan.nextLine();




            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                break;
            }


        } while (loopAgain);


    }








    @Override
    public void showDoctor(){
        int i=1;
        for (Map doctor:myDoctors){
            System.out.println("\nDoctor n:" +i + "\n"+ doctor.entrySet());
            i++;
        }
    }
}
