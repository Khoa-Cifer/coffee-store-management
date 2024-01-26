package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Ingredient;

import java.util.ArrayList;

public interface IngredientDAO {
    public ArrayList<Ingredient> getAllIngredients();
    public boolean insertIngredient(Ingredient ingredient);
    public Ingredient getIngredient(String ingredientCode);
    public boolean updateIngredient(String ingredientCode);
    public boolean deleteIngredient(String ingredientCode);
}
