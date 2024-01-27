/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.service;

import com.cifer.coffeestoremanagement.controller.IngredientController;
import com.cifer.coffeestoremanagement.dao.IngredientDAO;
import com.cifer.coffeestoremanagement.dao.IngredientDaoImp;
import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.model.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cifer
 */
public class IngredientManageServiceImp implements IngredientManageService {
    private IngredientDaoImp ingredientDAO = new IngredientDaoImp();
    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientDAO.insertIngredient(ingredient);
    }

    @Override
    public void updateIngredientInformation(Ingredient ingredient) {

    }

    @Override
    public void deleteIngredient(Ingredient ingredient) {

    }


    @Override
    public void showIngredient() {
        for (int i = 0; i < ingredientDAO.getAllIngredients().size(); i++) {
            System.out.println(ingredientDAO.getAllIngredients().get(i).toString());
        }
    }

    public int totalIngredient() {
        return ingredientDAO.getAllIngredients().size();
    }
}
