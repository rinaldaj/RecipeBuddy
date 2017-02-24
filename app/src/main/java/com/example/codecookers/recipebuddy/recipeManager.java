package com.example.codecookers.recipebuddy;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Anthony on 2/23/2017.
 */

public class recipeManager implements DataSystem {
    private SQLiteDatabase db;
    private recipe[] recipes;

    public recipeManager(){

    }
    @Override
    public recipe[] getRecipes() {

    }

    @Override
    public boolean saveRecipe(recipe r) {

    }

    @Override
    public boolean deleteRecipe(recipe r) {

    }

    @Override
    public boolean replaceRecipe(recipe old, recipe nu) {

    }

}
