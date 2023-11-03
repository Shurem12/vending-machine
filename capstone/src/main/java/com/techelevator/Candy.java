package com.techelevator;

public class Candy extends Food {
    @Override
    public String foodSound(){
        return "Munch Munch, Yum!";
    }
    public Candy(String location,String name, Double cost){
        super(location,name,cost);

    }


}
