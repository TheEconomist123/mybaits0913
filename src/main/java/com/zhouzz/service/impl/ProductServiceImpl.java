package com.zhouzz.service.impl;

import com.zhouzz.mapper.ProductMapper;
import com.zhouzz.pojo.Product;
import com.zhouzz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-12 13:33
 * @desc
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }
}
