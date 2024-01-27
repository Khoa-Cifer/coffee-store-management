/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifer.coffeestoremanagement.model;

/**
 *
 * @author Cifer
 */
public class Ingredient extends Beverage {

    private int quantity;

    public Ingredient(String id, String name, int quantity, boolean status) {
        super(id, name, status);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static Ingredient interactWithDb(String line) {
        String[] fields = line.split("#");
        return new Ingredient(fields[0], fields[1], Integer.parseInt(fields[2]), Boolean.parseBoolean(fields[3]));
    }
    @Override
    public String toString() {
        return id + "#" + name + "#" + quantity + "#" + status;
    }
}
