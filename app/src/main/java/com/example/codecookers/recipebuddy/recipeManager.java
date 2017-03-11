package com.example.codecookers.recipebuddy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Anthony on 2/23/2017.
 */

public class recipeManager implements DataSystem {
    private SQLiteDatabase db;
    private recipe[] recipes;
    private dbManager manager;
    private SQLiteDatabase DB;
    private static recipeManager r;

    class dbManager extends SQLiteOpenHelper{

        dbManager(Context context){
            super(context,"RecipeBuddy",null,1);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE RECIPES (recipeId int primary key AUTO_INCREMENT)");
            db.execSQL("CREATE TABLE STEPS (recipeId int not null,number int,step char(100000) not null,foreign key(recipeId) references RECIPES(recipeId))");
            db.execSQL("CREATE TABLE INGREDIENTS (recipeId int not null,name char(100) not null,quantity decimal(8,2) not null,units char(100) not null,key(recipeId) references RECIPES(recipeId))");
            db.execSQL("CREATE TABLE STOCK(name char(100) not null, quantity decimal(8,2)) not null, units not null");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

    public static recipeManager connect(Context context){
        if(r == null){
            r = new recipeManager(context);
        }
        return r;
    }

    private recipeManager(Context context){
        manager = new dbManager(context);
        DB = manager.getWritableDatabase();
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
