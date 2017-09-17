package com.example.codecookers.recipebuddy;

/**
 * Created by Anthony on 4/15/2017.
 */
//UNFINISHED!!! NEEDS IMPLEMENTASTION
public class Inventory {
    private Ingredients[] inventory;
    private int lastFilled;
    public Inventory(){
        inventory=null;
        lastFilled=0;
    }
    public Inventory(Ingredients[] in){
        inventory = in;
        lastFilled = in.length;
    }

    public void addIngredient(Ingredients in){
        if(inventory.length <= lastFilled ) {
            Ingredients tmp[]=new Ingredients[ inventory.length * 2];
            for (int i = 0; i < inventory.length; i++) {
                tmp[i] = inventory[i];
            }
            tmp[lastFilled] = in;
        }else{
                inventory[lastFilled] = in;
        }
        lastFilled++;

    }
    public Ingredients[] getInventory() {
        return inventory;
    }

    public void setInventory(Ingredients[] inventory) {
        this.inventory = inventory;
    }
}
