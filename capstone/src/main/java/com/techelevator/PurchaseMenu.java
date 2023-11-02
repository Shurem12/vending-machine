package com.techelevator;

import com.techelevator.view.Menu;

public class PurchaseMenu {

    private static final String PURCHASE_MENU_FEED_MONEY = "Please Enter Money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";

    private static final String PURCHASE_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] MAIN_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_FINISH_TRANSACTION};

    private Menu menu = new Menu(System.in, System.out);


   /* public PurchaseMenu(Menu menu) {
        this.menu = menu;
    }

    */

   /* public PurchaseMenu(){
        this.menu = menu;
    }

    */

    public void runPurchase() {
       // public void onEnter () {



        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(PURCHASE_MENU_FEED_MONEY)) {
                // display vending machine items
                System.out.println("Here it is.");

            } else if (choice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
                // do purchase

            } else if (choice.equals(PURCHASE_FINISH_TRANSACTION)) {
                break;
            }
        }
    }
}




