package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 2/20/2017.
 */

public class recipe {
    protected String[] steps;
    protected String[] ingredients;
    protected int[] quantities;// this should be parallel to ingredients
    protected String name;

    public recipe(String n,String[] ing,int[] quant , String[] stp){
        steps = stp;
        ingredients = ing;
        quantities = quant;
        name = n;
    }

    public String[] getSteps(){
        return steps;
    }
    public String[] getIngredients(){
        return ingredients;
    }
}
