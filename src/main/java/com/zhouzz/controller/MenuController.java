package com.zhouzz.controller;

import com.zhouzz.common.CommonResult;
import com.zhouzz.pojo.Menu;
import com.zhouzz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-06 22:40
 * @desc
 */
@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "*")
public class MenuController {



    @Autowired
    private MenuService menuService;

    @RequestMapping("/tree")
    public CommonResult getMenuTree() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode("000000");
        commonResult.setMsg("success");
        List<Menu> menuTree = menuService.getMenuTree();
        System.out.println("menuTree.toString() = " + menuTree.toString());
        commonResult.setData(menuTree);
        return commonResult;
    }


}
