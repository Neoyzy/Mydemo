package com.imooc.demo.Repository;

import com.imooc.demo.DataObject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SellerInfoRepository extends JpaRepository {
    SellerInfo findByOpenid(String openid);
}
