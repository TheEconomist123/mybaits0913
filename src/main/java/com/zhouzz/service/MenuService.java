package com.zhouzz.service;

import com.zhouzz.pojo.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**@author zzz
*@date 2024-11-06 22:36
*@version 1.0
*@desc
 *
*/
@Service
public interface MenuService {

    public List<Menu> getMenuTree();
}
