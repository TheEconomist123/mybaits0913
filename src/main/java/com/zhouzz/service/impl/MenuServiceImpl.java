package com.zhouzz.service.impl;

import com.zhouzz.mapper.MenuMapper;
import com.zhouzz.pojo.Menu;
import com.zhouzz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-06 22:37
 * @desc
 */
@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuTree() {

        List<Menu> menus = menuMapper.selectByExample(null);

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
                    parentMenu.getChildren().add(menu); // 将当前菜单添加到父菜单的 children 中
                }
            }
        }

        // 排序根节点及其子节点
        rootMenus.sort(Comparator.comparingLong(Menu::getOrderNo)); // 对根节点按 order 排序
        rootMenus.forEach(this::sortChildren); // 递归对子节点排序

        return rootMenus; // 返回排序后的根节点列表
    }

    // 递归方法：对每个菜单节点的 children 按 order 排序
    private void sortChildren(Menu menu) {
        if (menu.getChildren() != null && !menu.getChildren().isEmpty()) {
            menu.getChildren().sort(Comparator.comparingLong(Menu::getOrderNo)); // 对 children 排序
            menu.getChildren().forEach(this::sortChildren); // 递归对子节点排序
        }
    }


}
