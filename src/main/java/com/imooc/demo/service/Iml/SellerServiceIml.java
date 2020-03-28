package com.imooc.demo.service.Iml;

import com.imooc.demo.DataObject.SellerInfo;
import com.imooc.demo.Repository.SellerInfoRepository;
import com.imooc.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceIml implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
