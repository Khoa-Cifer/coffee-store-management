package com.cifer.coffeestoremanagement.dao;

import com.cifer.coffeestoremanagement.model.Menu;

import java.util.ArrayList;

public interface MenuDAO {
    public ArrayList<Menu> getAllMenus();
    public boolean insertMenu(Menu menu);
    public Menu getMenu(String menuCode);
    public boolean updateMenu(String menuCode);
    public boolean deleteMenu(String menuCode);
}
