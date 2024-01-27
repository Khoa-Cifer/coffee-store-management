package com.cifer.coffeestoremanagement.model;

import java.util.Collections;
import java.util.List;

public class Drink extends Beverage {
    private List<Ingredient> ingredientList;

    public Drink(String id, String name, List<Ingredient> ingredientList, boolean status) {
        super(id, name, status);
        this.ingredientList = ingredientList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public static Drink interactWithDb(String line) {
        String[] fields = line.split(",");
        Ingredient newIngredient = Ingredient.interactWithDb(fields[2]);
        return new Drink(fields[0], fields[1], Collections.singletonList(newIngredient), Boolean.parseBoolean(fields[3]));
    }
    @Override
    public String toString() {
        return id + ",|" + name + "," + ingredientList + "," + status;
    }
}
