/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.model;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cifer
 */
public class Menu extends Beverage {

    private List<Drink> drinkList;

    public Menu(String id, String name, List<Drink> drinkList, boolean status) {
        super(id, name, status);
        this.drinkList = drinkList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public static Menu interactWithDb(String line) {
        String[] fields = line.split("\\|");
        Drink newDrink = Drink.interactWithDb(fields[2]);
        return new Menu(fields[0], fields[1], Collections.singletonList(newDrink), Boolean.parseBoolean(fields[3]));
    }
    @Override
    public String toString() {
        return id + "|" + name + "|" + drinkList + "|" + status;
    }
}
