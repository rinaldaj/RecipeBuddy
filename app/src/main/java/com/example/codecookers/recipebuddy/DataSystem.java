package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 2/20/2017.
 */

public interface DataSystem {
    recipe[] getRecipes();
    boolean saveRecipe(recipe r);
    boolean deleteRecipe(recipe r);
    boolean replaceRecipe(receipe old, recipe nu);
}
