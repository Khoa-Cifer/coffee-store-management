package com.cifer.coffeestoremanagement.util;

import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class MenuUtilsImp extends ArrayList<String> implements MenuUtils {
    @Override
    public void addItem(String menuItem) {
        this.add(menuItem);
    }

    @Override
    public int getChoice() {
        return Utils.getNumber("Input your choice: ", 1, this.size());
    }

    @Override
    public void showMenu() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }
}
