package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    //make an array list - called inventory
    //make a filereader and put in the inventory

    ArrayList<String> inventory = new ArrayList<>();

    String fileName = "C:\\Users\\Student\\workspace\\oct-blue-capstone-1-team-9\\capstone\\vendingmachine.csv";

    File file = new File(fileName);

    public void run() {

        try (Scanner fileReader = new Scanner(file)) {

            while(fileReader.hasNextLine()){

                String line = fileReader.nextLine();

                String[] inv = line.split("\\|");

                inventory.add(line);

                String itemLocation = inv[0];
                String itemName = inv[1];
                String itemCost = inv[2];
                String itemType = inv[3];



            }



        } catch(Exception ex){

        System.out.println("Unable to read file.");
    }
    }




}
