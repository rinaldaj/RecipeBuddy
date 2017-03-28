package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 2/20/2017.
 */

public class recipe {
    private String[] steps;
    private Ingredients[] ingredients;
    private String name;
    private int timesMade;

    public recipe(String n,Ingredients[] ing, String[] stp,int times){
        steps = stp;
        ingredients = ing;
        name = n;
        timesMade = times;
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

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public int getTimesMade() {
        return timesMade;
    }

    public void setTimesMade(int timesMade) {
        this.timesMade = timesMade;
    }
}
