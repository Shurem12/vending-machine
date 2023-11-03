package com.techelevator;

public class Drinks extends Food{

    @Override
    public String foodSound(){
        return "Glug Glug, Yum!";
    }
    public Drinks(String location,String name, Double cost){
        super(location,name,cost);

    }

}
