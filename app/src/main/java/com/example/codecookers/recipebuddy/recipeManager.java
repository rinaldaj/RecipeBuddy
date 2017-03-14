package com.example.codecookers.recipebuddy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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
            db.execSQL("CREATE TABLE RECIPES (recipeId int primary key AUTO_INCREMENT,name char(500))");
            db.execSQL("CREATE TABLE STEPS (recipeId int not null,number int,step char(100000) not null,foreign key(recipeId) references RECIPES(recipeId))");
            db.execSQL("CREATE TABLE INGREDIENTS (recipeId int not null,name char(100) not null,quantity decimal(8,2) not null,units char(100) not null,foreign key(recipeId) references RECIPES(recipeId))");
            db.execSQL("CREATE TABLE STOCK(name char(100) not null, quantity decimal(8,2)) not null, units char(100) not null");
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
    public void saveRecipe(recipe r) {
        ContentValues vals = new ContentValues();
        vals.put("name",r.getName());
        DB.insert("RECIPES",null,vals);

        String[] cols = {"recipeId"};
        Cursor cursor = DB.query("RECIPES",cols,null,null,null,null,"recipeId DESC");
        int id =cursor.getInt(0);
        cursor.close();
        for(Ingredients ing: r.getIngredients()){
            //recipeId,name,quantity,units
            vals = new ContentValues();
            vals.put("recipeId",id);
            vals.put("name",ing.getName());
            vals.put("quantity",ing.getQuantity());
            vals.put("units",ing.getUnits());
            DB.insert("INGREDIENTS",null,vals);
        }
        int stepNum = 0;
        for(String step: r.getSteps()){
           //recipeId,number,step
            vals = new ContentValues();
            vals.put("recipeId",id);
            vals.put("number",stepNum);
            vals.put("step",step);
            DB.insert("STEPS",null,vals);
            stepNum++;
        }
    }

    @Override
    public void deleteRecipe(recipe r) {

    }

    @Override
    public void replaceRecipe(recipe old, recipe nu) {

    }

    @Override
    public double getStock(Ingredients ing) {
        return 0;
    }

    @Override
    public void addStock(Ingredients ing) {

    }

}
