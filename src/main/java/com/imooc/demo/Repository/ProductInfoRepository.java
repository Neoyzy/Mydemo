package com.imooc.demo.Repository;

import com.imooc.demo.DataObject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {


    List<ProductInfo> findByProductStatus(Integer productStatus);
    List<ProductInfo> findByProductName(String productId);
}
