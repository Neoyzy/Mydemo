package com.imooc.demo.Converter;

import com.imooc.demo.DTO.OrderDTO;
import com.imooc.demo.DataObject.OrderMaster;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasters){
        return orderMasters.stream().
                map(e -> convert(e)).collect(Collectors.toList());
    }

}
