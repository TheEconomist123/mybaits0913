package com.zhouzz.mybatis;

import com.zhouzz.BaseTest;
import com.zhouzz.pojo.PendCountDto;
import com.zhouzz.pojo.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-12 13:36
 * @desc
 */
public class DataJpaProductTest extends BaseTest {

    //测试向产品表里面插入数据
    @Test
    public void testInsertProduct() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Product product = new Product();
            product.setProductName("测试产品数据24124");
            product.setDescription("这是一段测试产品描述");
            product.setCreatedAt(LocalDateTime.now());
            product.setUpdatedAt(LocalDateTime.now());
            int x = productMapper.insertProduct(product);
            System.out.println("插入数据影响的行数为: " + x);

        }

        long l1 = System.currentTimeMillis();
        System.out.println("耗时：" + (l1 - l) + "毫秒");

    }
    //根据主键查询产品数据

    @Test
    public void testSelectProductById() {
        Product product = productMapper.selectProductById(100000000001304l);
        LocalDateTime createdAt = product.getCreatedAt();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");
        String format = createdAt.format(formatter);
        System.out.println("打印更新时间:"+format);


        System.out.println(product);
    }
    //删除数据

    @Test
    public void testDeleteProductById() {
        int i = productMapper.deleteProductById(100000000001309L);
        System.out.println("删除数据的个数："+i);
    }
    //更新数据
    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        product.setProductId(100000000001304l);
        product.setProductName("如何给数据库表字段命名");
        product.setDescription("这是一段测试产品描述");
        product.setUpdatedAt(LocalDateTime.now());
        int i = productMapper.updateProduct(product);
        System.out.println("更新数据的个数：" + i);
    }
    //写一个统计查询
    @Test
    public void testCountProduct() {
        String  job="CLERK";
       PendCountDto pendCountDto = productMapper.queryPendingCount(job);
        System.out.println("产品总数：" + pendCountDto);
    }


}
