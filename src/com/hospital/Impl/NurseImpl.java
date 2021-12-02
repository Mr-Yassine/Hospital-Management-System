package com.hospital.Impl;

import com.hospital.interfaces.NurseInterface;
import com.hospital.models.*;
import com.hospital.models.Nurse;
import java.util.*;




public class NurseImpl implements NurseInterface {

    Nurse nurses = new Nurse();
    List<HashMap> myNurses = new ArrayList<>();
    Scanner scan = new Scanner(System.in);




    @Override
    public void addNurse() {


        String answer;
        boolean loopAgain = true;



        do {


            // Create a HashMap object called ourNurses
            HashMap ourNurses = new HashMap<>();

            System.out.print("Enter the First Name:");
            nurses.setFirstname(scan.nextLine());

            System.out.print("Enter the Last Name:");
            nurses.setLastname(scan.nextLine());

            System.out.print("Enter the profession number:");
            nurses.setProfessionNumber(scan.nextLine());



            ourNurses.put("Prenom",nurses.getFirstname());
            ourNurses.put("Nom",nurses.getLastname());
            ourNurses.put("professionNumber",nurses.getProfessionNumber());
            myNurses.add(ourNurses);



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












    @Override
    public void showNurse(){
        int i=1;
        for (Map nurse:myNurses){
            System.out.println("\nNurse n:" +i + "\n"+ nurse.entrySet());
            i++;
        }
    }

}
