package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class Inventory {


    private Food totalAvailable = new Food();
    private String itemLocation;
    private String itemName;
    private String itemCost;

    public String getItemLocation() {
        return itemLocation;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCost() {
        return itemCost;
    }

    String fileName = "vendingmachine.csv";

    File file = new File(fileName);


    public void runInventory() {

        try (Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                String[] inv = line.split("\\|");


                //inventory.add(line);

                String itemLocation = inv[0];
                String itemName = inv[1];
                String itemCost = inv[2];
                // String itemType = inv[3];

                //for(int i=1; i<inv.length;i++){
                //System.out.println(itemLocation + " " + itemName + " " + itemCost + " " + "Available: " + totalAvailable.getStock());



            }


        } catch (Exception ex) {

            System.out.println("Unable to read file.");
        }


    }




}
