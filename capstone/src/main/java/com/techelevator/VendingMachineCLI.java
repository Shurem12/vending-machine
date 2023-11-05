package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";

	private static final String MAIN_MENU_OPTION_SECRET ="Shhhh";

	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,MAIN_MENU_OPTION_EXIT, MAIN_MENU_OPTION_SECRET};

	private Menu menu;

	private PurchaseMenu pm = new PurchaseMenu();

	private VendingMachine vm= new VendingMachine();
	private Customer cm=new Customer();
	private Inventory inventory = new Inventory();





	String sale = "Sale.txt";
	private File saleFile = new File(sale);

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		inventory.runInventory();

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);


			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				vm.runInventory();

				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase

				pm.runPurchase();


			}
			else if(choice.equals(MAIN_MENU_OPTION_EXIT)){
				break;
			}
			else if(choice.equals(MAIN_MENU_OPTION_SECRET)){
				try(PrintWriter writer = new PrintWriter(new FileOutputStream(saleFile,true))){
					for(Food item : inventory.getListFood()){
					writer.println(item.getName()+ " | "+ item.getStockSold());
					}


				} catch(Exception ex){
					System.out.println("Error printing to log.");
				}

			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		//PurchaseMenu pm = new PurchaseMenu(menu);
		cli.run();


	}
}
