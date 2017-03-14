package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 2/20/2017.
 */

public interface DataSystem {
    public recipe[] getRecipes();
    public void saveRecipe(recipe r);
    public void deleteRecipe(recipe r);
    public void replaceRecipe(recipe old, recipe nu);
    public double getStock(Ingredients ing);
    public void addStock(Ingredients ing);

}
