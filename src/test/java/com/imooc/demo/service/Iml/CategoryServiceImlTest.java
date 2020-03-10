package com.imooc.demo.service.Iml;

import com.imooc.demo.DataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImlTest {

    @Autowired
    private CategoryServiceIml categoryServiceIml;

    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory = categoryServiceIml.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> productCategory = categoryServiceIml.findAll();
        Assert.assertNotEquals(productCategory.size(), null);

    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("Spring is not chun", 22);
        ProductCategory res = categoryServiceIml.save(productCategory);
        Assert.assertNotEquals(null, res);
    }

    @Test
    public void findByCategoryTypeIn() {
    }
}