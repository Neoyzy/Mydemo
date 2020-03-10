package com.imooc.demo.Repository;

import com.imooc.demo.DataObject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12234");
        productInfo.setCategoryType(1002);
        productInfo.setProductDescription("it is a good product");
        productInfo.setProductIcon("xxxxxxxxx");
        productInfo.setProductName("nike-airs");
        productInfo.setProductPrice(new BigDecimal("28.9"));
        productInfo.setProductStatus(1);
        productInfo.setProductStock(12);
        ProductInfo res = repository.save(productInfo);
        Assert.assertNotEquals(res, null);

    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfos = repository.findByProductStatus(1);
        Assert.assertNotEquals(productInfos.size(), 0);


    }

    @Test
    public void findByProductName() {

        List<ProductInfo> productInfos = repository.findByProductName("nike-airs");
        Assert.assertNotEquals(productInfos.size(), 0);
    }
}