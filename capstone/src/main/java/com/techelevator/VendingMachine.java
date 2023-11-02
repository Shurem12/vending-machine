package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    ArrayList<String> inventory = new ArrayList<>();

    String fileName ="C:\\Users\\Tech Elevator IT\\workspace\\oct-blue-capstone-1-team-9\\capstone\\vendingmachine.csv";

    File file = new File(fileName);

    public void runInventory() {

        try (Scanner fileReader = new Scanner(file)) {

            while(fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                String[] inv = line.split("\\|");


                //inventory.add(line);

                String itemLocation = inv[0];
                String itemName = inv[1];
                String itemCost = inv[2];
                // String itemType = inv[3];

                //for(int i=1; i<inv.length;i++){
                System.out.println(itemLocation + " " + itemName + " " + itemCost);


           // }



               // System.out.println(inventory);



            }



        } catch(Exception ex){

            System.out.println("Unable to read file.");
        }
    }




}





