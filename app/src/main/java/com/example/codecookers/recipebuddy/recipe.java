package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 2/20/2017.
 */

public class recipe {
    protected String[] steps;
    protected Ingredients[] ingredients;
    protected String name;

    public recipe(String n,Ingredients[] ing, String[] stp){
        steps = stp;
        ingredients = ing;
        name = n;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public  void setIngredients(Ingredients[] ingred){
        ingredients = ingred;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
