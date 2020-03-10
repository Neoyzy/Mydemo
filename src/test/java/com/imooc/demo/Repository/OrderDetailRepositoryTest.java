package com.imooc.demo.Repository;

import com.imooc.demo.DataObject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1111");
        orderDetail.setOrderId("1111");
        orderDetail.setProductIcon("http:/xxx");
        orderDetail.setProductName("hello kitty");
        orderDetail.setProductId("1111");
        orderDetail.setProductPrice(new BigDecimal(3.22));
        orderDetail.setProductQuantity(1000);
        OrderDetail res = repository.save(orderDetail);
        Assert.assertNotEquals(res, null);
    }


    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetail1 = repository.findByOrderId("1111");
        Assert.assertNotEquals(orderDetail1.size(), 0);

    }



}