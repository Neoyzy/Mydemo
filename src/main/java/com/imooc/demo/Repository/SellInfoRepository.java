package com.imooc.demo.Repository;

import com.imooc.demo.DataObject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface SellInfoRepository extends JpaRepository {
    List<SellerInfo> findBySellerID(String sellerId);
}
