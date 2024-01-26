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
public class Menu {
    private String code;
    private String name;
    private List<Drink> drinkList;
    private boolean status;

    public Menu(String code, String name, List<Drink> drinkList, boolean status) {
        this.code = code;
        this.name = name;
        this.drinkList = drinkList;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public static Menu interactWithDb(String line) {
        String[] fields = line.split("\\|");
        Drink newDrink = Drink.interactWithDb(fields[2]);
        return new Menu(fields[0], fields[1], Collections.singletonList(newDrink), Boolean.parseBoolean(fields[3]));
    }
    @Override
    public String toString() {
        return code + "|" + name + "|" + drinkList + "|" + status;
    }
}
