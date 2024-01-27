package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Ingredient;

import java.io.*;
import java.util.ArrayList;

public class IngredientDaoImp implements IngredientDAO {
    private static final File file = new File("src/com/cifer/coffeestoremanagement/resource/Ingredient.dat");
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
            return ingredientArrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertIngredient(Ingredient ingredient) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
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
                if (ingredient.getId().equalsIgnoreCase(ingredientCode)) {
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
    public boolean updateIngredient(Ingredient newIngredient) {
        try {
            File tempFile = new File("src/com/cifer/coffeestoremanagement/resource/temp.dat");
            if (!tempFile.exists()) {
                tempFile.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(tempFile);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Ingredient ingredient = Ingredient.interactWithDb(line);
                if (ingredient.getId().equalsIgnoreCase(newIngredient.getId())) {
                    fileWriter.write(newIngredient.toString() + "\n");
                } else {
                    fileWriter.write(line + "\n");
                }
            }
            bufferedReader.close();
            fileWriter.close();
            file.delete();
            tempFile.renameTo(file);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteIngredient(String ingredientCode) {
        return false;
    }


}
