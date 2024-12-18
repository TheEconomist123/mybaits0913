package com.zhouzz.mapper;

import com.zhouzz.pojo.PendCountDto;
import com.zhouzz.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface ProductMapper  {


    @Insert("insert into product(product_name, description,created_at, updated_at) values(#{productName}, #{description}, #{createdAt}, #{updatedAt})")
    int insertProduct(Product product);

    //查询产品数据
    @Select("select * from product where product_id = #{id}")
    Product selectProductById(Long id);

    //删除产品
    @Delete("delete from product where product_id = #{id}")
    int deleteProductById(Long id);

    //更新产品
    @Update("update product set product_name = #{productName}, description = #{description}, updated_at = #{updatedAt} where product_id = #{productId}")
    int updateProduct(Product product);

    //模糊查询，存在就查询，不存在就不查询，返回所有产品数据
    @Select("select * from product where product_name like #{productName}" )
    List<Product> selectProductByName(String productName);


    PendCountDto queryPendingCount(String job);
}
