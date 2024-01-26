package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Drink;

import java.util.ArrayList;

public interface DrinkDao {
    public ArrayList<Drink> getAllIngredients();
    public boolean insertIngredient(Drink drink);
    public Drink getIngredient(String drinkCode);
    public boolean updateIngredient(String drinkCode);
    public boolean deleteIngredient(String drinkCode);
}
