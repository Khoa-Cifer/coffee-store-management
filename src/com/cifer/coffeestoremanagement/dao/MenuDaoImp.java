package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Ingredient;
import com.cifer.coffeestoremanagement.model.Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class MenuDaoImp implements MenuDAO {
    private static final File file = new File("src/resource/Menu.dat");
    @Override
    public ArrayList<Menu> getAllMenus() {
        ArrayList<Menu> menuList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Menu menu = Menu.interactWithDb(line);
                menuList.add(menu);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menuList;
    }

    @Override
    public boolean insertMenu(Menu menu) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(menu.toString() + "\n");
            fileWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Menu getMenu(String menuCode) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Menu menu = Menu.interactWithDb(line);
                if (menu.getId().equalsIgnoreCase(menuCode)) {
                    fileReader.close();
                    bufferedReader.close();
                    return menu;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateMenu(String menuCode) {

        return false;
    }

    @Override
    public boolean deleteMenu(String menuCode) {
        return false;
    }


}
