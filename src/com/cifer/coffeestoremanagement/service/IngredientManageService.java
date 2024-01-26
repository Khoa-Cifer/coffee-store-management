/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.service;

import com.cifer.coffeestoremanagement.model.Ingredient;

import java.util.ArrayList;

/**
 *
 * @author Cifer
 */
public interface IngredientManageService {

    void addIngredient(Ingredient ingredient);

    void updateIngredientInformation();

    void deleteIngredient();

    void showIngredient();
}
