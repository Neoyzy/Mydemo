package com.imooc.demo.service;

import com.imooc.demo.DataObject.SellerInfo;
import org.springframework.stereotype.Service;

@Service
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);

}

