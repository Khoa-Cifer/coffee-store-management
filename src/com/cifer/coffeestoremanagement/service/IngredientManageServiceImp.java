/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.service;

import com.cifer.coffeestoremanagement.dao.IngredientDAO;
import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.model.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cifer
 */
public class IngredientManageServiceImp extends ArrayList<Ingredient> implements IngredientManageService {
    private IngredientDAO ingredientDAO;

    public IngredientManageServiceImp(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    private List<Menu> menuList = new ArrayList<>();
    private List<Ingredient> stringList = new ArrayList<>();
    @Override
    public void addIngredient() {


    }

    @Override
    public void updateIngredientInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteIngredient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showIngredient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
