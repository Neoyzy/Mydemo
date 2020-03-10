package com.imooc.demo.service;

import com.imooc.demo.DTO.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
