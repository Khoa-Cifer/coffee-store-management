package com.cifer.coffeestoremanagement.model;

import java.util.Collections;
import java.util.List;

public class Drink {
    private String code;
    private String name;
    private List<Ingredient> ingredientList;
    private boolean status;

    public Drink(String code, String name, List<Ingredient> ingredientList, boolean status) {
        this.code = code;
        this.name = name;
        this.ingredientList = ingredientList;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> stringList) {
        this.ingredientList = stringList;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static Drink interactWithDb(String line) {
        String[] fields = line.split(",");
        Ingredient newIngredient = Ingredient.interactWithDb(fields[2]);
        return new Drink(fields[0], fields[1], Collections.singletonList(newIngredient), Boolean.parseBoolean(fields[3]));
    }
    @Override
    public String toString() {
        return code + ",|" + name + "," + ingredientList + "," + status;
    }
}
