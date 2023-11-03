package com.techelevator;

public class Customer {

    //how much money they put in
    //change
    //selection
private Double balance;
private String selections;

    public Double getBalance() {
        return balance;
    }

    public String getSelections() {
        return selections;
    }

    public void setSelections(String selections) {
        this.selections = selections;
    }
    public Customer(){
        balance = 0.0;
    }
    public void addMoney(Double money){
        balance+=money;

    }
    public void makePurchase(Double cost){
        if(balance>=cost){
            balance-=cost;
        }else{
            System.out.println("You do not have enough money");
        }

    }
}
