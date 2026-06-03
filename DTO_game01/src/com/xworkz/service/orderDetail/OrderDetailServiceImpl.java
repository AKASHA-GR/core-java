package com.xworkz.service.orderDetail;

import com.xworkz.dto.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService{
    @Override
    public void validateAndSave(OrderDetailDTO orderDetailDTO) {
        System.out.println("The validate and save the OrderDetailDTO"+orderDetailDTO);
    }
}
