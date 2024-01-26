package com.cifer.coffeestoremanagement.controller;

import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.service.IngredientManageServiceImp;
import com.cifer.coffeestoremanagement.util.Utils;

import java.util.ArrayList;
import java.util.List;

public class IngredientController {
    private IngredientManageServiceImp ingredientManageService;

    public IngredientController(IngredientManageServiceImp ingredientManageService) {
        this.ingredientManageService = ingredientManageService;
    }

    public Ingredient addIngredient() {
        String code = Utils.autoGenerateId("I", 7, ingredientManageService.size());
        String name = Utils.getString("Input ingredient's name", 10);
        int quantity = Utils.getNumber("Input ingredient's quantity", 0, 1000);
        boolean status = true;
        return new Ingredient(code, name, quantity, status);
    }

    public Ingredient updateIngredient(Ingredient oldIngredient) {
        String name = Utils.updateString("Update ingredient's name", 10, oldIngredient.getName());
        int quantity = Utils.updateNumber("Update ingredient's quantity", 0, 1000, oldIngredient.getQuantity());
        return new Ingredient(oldIngredient.getCode(), name, quantity, oldIngredient.isStatus());
    }

    public void deleteIngredient() {

    }

    public void showAllAvailableIngredient() {

    }
}
