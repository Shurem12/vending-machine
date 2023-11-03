package com.techelevator;

import com.techelevator.view.Menu;

import java.util.Scanner;

public class PurchaseMenu extends Inventory {

    private static final String PURCHASE_MENU_FEED_MONEY = "Feed money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select product";

    private static final String PURCHASE_FINISH_TRANSACTION = "Finish transaction";
    private static final String[] MAIN_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_FINISH_TRANSACTION};

    private VendingMachine purchaseVending = new VendingMachine();
    private Integer moneyInputTotal = 0;
    private final Scanner userInput = new Scanner(System.in);
    private Menu menu = new Menu(System.in, System.out);


    //public PurchaseMenu(Menu menu) {
      //  this.menu = menu;
    //}

    public void runInventory(){

    }

    public void runPurchase() {
       // public void onEnter () {



        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(PURCHASE_MENU_FEED_MONEY)) {
                // display vending machine items
                System.out.println("Please enter money");

                String moneyInput = userInput.nextLine();

                Integer moneyInputNumber = Integer.parseInt(moneyInput);

                moneyInputTotal += moneyInputNumber;


                System.out.println("Current available funds: " + moneyInputTotal);


            } else if (choice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {

                System.out.println("Please enter item number: ");
                String userSelection = userInput.nextLine();


                if(userSelection.equals(purchaseVending.getItemLocation())){

                    System.out.println("You have selected: " + purchaseVending.getItemLocation());

                }


                // do purchase
            } else if (choice.equals(PURCHASE_FINISH_TRANSACTION)) {
                break;
            }
        }
    }
}




