package com.techelevator;

public class Gum extends Food {
    @Override
    public String foodSound(){
        return "Chew Chew, Yum!";
    }
    public Gum(String location,String name, Double cost){
        super(location,name,cost);

    }

}
