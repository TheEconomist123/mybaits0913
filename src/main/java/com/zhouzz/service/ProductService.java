package com.zhouzz.service;

import com.zhouzz.mapper.ProductMapper;
import com.zhouzz.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-12 13:31
 * @desc
 */
@Service
public interface ProductService {

    void insertProduct(Product product);

}
