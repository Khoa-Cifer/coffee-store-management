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
public class Ingredient {
    private String code;
    private String name;
    private int quantity;
    private boolean status;

    public Ingredient(String code, String name, int quantity, boolean status) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static Ingredient interactWithDb(String line) {
        String[] fields = line.split("#");
        return new Ingredient(fields[1], fields[2], Integer.parseInt(fields[3]), Boolean.parseBoolean(fields[4]));
    }
    @Override
    public String toString() {
        return code + "#" + name + "#" + quantity + "#" + status;
    }
}
