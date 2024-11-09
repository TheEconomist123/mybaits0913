package com.zhouzz.tree;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Menu;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-06 22:29
 * @desc
 */
public class TestTree   extends BaseTest {



    @Test
    public void test(){

      System.out.println("empMapperTest = " + getMenuTree());;


    }
    public List<Menu> getMenuTree() {
        List<Menu> menus = menuMapper.selectByExample(null); // 查询所有菜单数据
        return buildTree(menus);
    }

    private List<Menu> buildTree(List<Menu> menus) {
        Map<Long, Menu> menuMap = new HashMap<>();
        List<Menu> rootMenus = new ArrayList<>();

        // 将所有菜单以ID为键放入map
        for (Menu menu : menus) {
            menuMap.put(menu.getId(), menu);
        }

        // 构建树形结构
        for (Menu menu : menus) {
            if (menu.getParentId() == null) {
                rootMenus.add(menu); // 根节点
            } else {
                Menu parentMenu = menuMap.get(menu.getParentId());
                if (parentMenu != null) {
                    parentMenu.getChildren().add(menu); // 将当前菜单添加到父菜单的children中
                }
            }
        }

        return rootMenus; // 返回根节点列表
    }

}
