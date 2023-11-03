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
    private Food food = new Food();
    private Inventory invList = new Inventory();

    private VendingMachine vm= new VendingMachine();
    private Customer customer = new Customer();


    //public PurchaseMenu(Menu menu) {
      //  this.menu = menu;
    //}

    public void runInventory(){

    }

    public void runPurchase() {
       // public void onEnter () {


        invList.runInventory();
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(PURCHASE_MENU_FEED_MONEY)) {
                // display vending machine items
                System.out.println("Please enter money");

                String moneyInput = userInput.nextLine();

                Double moneyInputNumber = Double.parseDouble(moneyInput);
                customer.addMoney(moneyInputNumber);




                System.out.println("Current available funds: " + customer.getBalance());


            } else if (choice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
                vm.runInventory();

                System.out.println("Please enter item number: ");
                String userSelection = userInput.nextLine();

                Food item = invList.findItem(userSelection);
                if(item.getStock()>0&&customer.getBalance()>=item.getCost()) {
                    System.out.println(item.foodSound());
                    item.setStock(item.getStock() - 1);
                    System.out.println("You received " + item.getName());
                    System.out.println("There is: " + item.getStock() + " left in stock");
                }


                customer.makePurchase(item.getCost());
                System.out.println("New balance: "+ customer.getBalance());



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




