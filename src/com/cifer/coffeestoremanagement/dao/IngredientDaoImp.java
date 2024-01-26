package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Ingredient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class IngredientDaoImp implements IngredientDAO {
    private static final File file = new File("src/resource/Ingredient.dat");
    @Override
    public ArrayList<Ingredient> getAllIngredients() {
        ArrayList<Ingredient> ingredientArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Ingredient ingredient = Ingredient.interactWithDb(line);
                ingredientArrayList.add(ingredient);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertIngredient(Ingredient ingredient) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(ingredient.toString() + "\n");
            fileWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Ingredient getIngredient(String ingredientCode) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Ingredient ingredient = Ingredient.interactWithDb(line);
                if (ingredient.getCode().equalsIgnoreCase(ingredientCode)) {
                    fileReader.close();
                    bufferedReader.close();
                    return ingredient;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateIngredient(String ingredientCode) {
        return false;
    }

    @Override
    public boolean deleteIngredient(String ingredientCode) {
        return false;
    }


}
