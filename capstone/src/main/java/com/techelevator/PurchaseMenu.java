package com.techelevator;

import com.techelevator.view.Menu;

public class PurchaseMenu {

    private static final String PURCHASE_MENU_FEED_MONEY = "feed money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select product";

    private static final String PURCHASE_FINISH_TRANSACTION = "Finish transaction";
    private static final String[] MAIN_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_FINISH_TRANSACTION};

    private Menu menu;


    public PurchaseMenu(Menu menu) {
        this.menu = menu;
    }

    public void run() {
       // public void onEnter () {



        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(PURCHASE_MENU_FEED_MONEY)) {
                // display vending machine items
            } else if (choice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
                // do purchase
            } else if (choice.equals(PURCHASE_FINISH_TRANSACTION)) {
                break;
            }
        }
    }
}




