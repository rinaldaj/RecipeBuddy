package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 3/11/2017.
 */
public class Ingredients {
    private String name;
    private double quantity;
    private String units;

    public Ingredients(String n,double d,String u){
        name = n;
        quantity = d;
        units = u;
    }
    
    public String setName(String str) {
        name = str;
    }
    
    public String setQunatity(double qty) {
        quantity = qtr;
    }
    
    public String setUnits(String uni) {
        units = uni;
    }
    
    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnits() {
        return units;
    }
}
