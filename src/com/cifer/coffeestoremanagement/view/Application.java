package com.cifer.coffeestoremanagement.view;

import com.cifer.coffeestoremanagement.controller.IngredientController;
import com.cifer.coffeestoremanagement.util.MenuUtils;
import com.cifer.coffeestoremanagement.util.MenuUtilsImp;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void storeManagement() throws IOException {
        checkFile();
        MenuUtils menuUtils = new MenuUtilsImp();
        IngredientController ingredientController = new IngredientController();
        menuUtils.addItem("1. Add ingredient");
        menuUtils.addItem("2. Update ingredient");
        menuUtils.addItem("3. Show all ingredients");
        int choice;
        do {
            menuUtils.showMenu();
            choice = menuUtils.getChoice();
            switch (choice) {
                case 1:
                    ingredientController.addIngredient();
                    break;
                case 2:
                    ingredientController.updateIngredient();
                    break;
                case 3:
                    ingredientController.showAllAvailableIngredient();
                    break;
            }
        } while (choice != 4);
    }

    public static void checkFile() throws IOException {
        File ingredientDb = new File("src/com/cifer/coffeestoremanagement/resource/Ingredient.dat");
        if (!ingredientDb.exists()) {
            ingredientDb.createNewFile();
        }
        File menuDb = new File("src/com/cifer/coffeestoremanagement/resource/Menu.dat");
        if (!menuDb.exists()) {
            menuDb.createNewFile();
        }
        File drinkDb = new File("src/com/cifer/coffeestoremanagement/resource/Drink.dat");
        if (!drinkDb.exists()) {
            drinkDb.createNewFile();
        }
    }
}
