package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Drink;
import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.model.Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DrinkDaoImp implements DrinkDao {
    private static final File file = new File("src/resource/Order.dat");
    @Override
    public ArrayList<Drink> getAllIngredients() {
        ArrayList<Drink> drinkArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Drink drink = Drink.interactWithDb(line);
                drinkArrayList.add(drink);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertIngredient(Drink drink) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(drink.toString() + "\n");
            fileWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Drink getIngredient(String drinkCode) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Drink drink = Drink.interactWithDb(line);
                if (drink.getCode().equalsIgnoreCase(drinkCode)) {
                    fileReader.close();
                    bufferedReader.close();
                    return drink;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateIngredient(String drinkCode) {
        return false;
    }

    @Override
    public boolean deleteIngredient(String drinkCode) {
        return false;
    }
}
