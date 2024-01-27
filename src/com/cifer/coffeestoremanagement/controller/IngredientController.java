package com.cifer.coffeestoremanagement.controller;

import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.service.IngredientManageServiceImp;
import com.cifer.coffeestoremanagement.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class IngredientController {
    IngredientManageServiceImp ingredientManageService = new IngredientManageServiceImp();

    //Post
    public void addIngredient() {
        String code = Utils.autoGenerateId("I", 7, ingredientManageService.totalIngredient() + 1);
        String name = Utils.getString("Input ingredient's name: ", 10);
        int quantity = Utils.getNumber("Input ingredient's quantity: ", 0, 1000);
        boolean status = true;
        ingredientManageService.addIngredient(new Ingredient(code, name, quantity, status));
    }

    //Put
    public void updateIngredient() {
        String ingredientId = Utils.getString("Input ID to search: ", 8);
        Ingredient ingredient = ingredientManageService.getIngredient(ingredientId);
        if (ingredient != null) {
            ingredient.setName(Utils.updateString("Update ingredient's name: ", 10, ingredient.getName()));
            ingredient.setQuantity(Utils.updateNumber("Update Ingredient's quantity: ", 0, 1000, ingredient.getQuantity()));
            ingredientManageService.updateIngredientInformation(ingredient);
        } else {
            System.err.println("Ingredient not found !");
        }
    }

    //Delete
    public void deleteIngredient() {

    }

    //Get
    public void showAllAvailableIngredient() {
        ingredientManageService.showIngredient();
    }
}
