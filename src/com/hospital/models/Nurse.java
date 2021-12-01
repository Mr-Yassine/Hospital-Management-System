package com.hospital.models;

import java.util.*;

public class Nurse extends Person {


    private String professionNumber;
    private double salary;
    List<HashMap> myNurses = new ArrayList<>();


    public Nurse(){}

    public Nurse(String firstname,String lastname,String phone,String address, String professionNumber, TimeSlot shiftSlot, double salary) {
        super(firstname, lastname, phone, address);
        this.professionNumber = professionNumber;
        this.salary = salary;
    }


    public void addNurse() {


        String answer;
        int serialNumber;
        boolean loopAgain = true;


        Scanner scan = new Scanner(System.in);


        // Create a HashMap object called Nurse
        HashMap nurse = new HashMap<>();





        do {


            System.out.print("Enter the First Name:");
            this.setFirstname(scan.nextLine());

            System.out.print("Enter the Last Name:");
            this.setLastname(scan.nextLine());

            System.out.print("Enter the profession number:");
            professionNumber = scan.nextLine();



            nurse.put("Prenom",this.getFirstname());
            nurse.put("Nom",this.getLastname());
            nurse.put("professionNumber",professionNumber);
            myNurses.add(nurse);



            System.out.print("\n\nEnter another nurse (y/n)?");
            answer = scan.nextLine();




            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                break;
            }


        } while (loopAgain);
        //scan.close();


    }


    public void showNurse(){
        System.out.println("\n" + myNurses);
    }

}
