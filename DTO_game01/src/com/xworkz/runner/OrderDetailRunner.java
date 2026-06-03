package com.xworkz.runner;

import com.xworkz.dto.OrderDetailDTO;
import com.xworkz.service.orderDetail.OrderDetailService;
import com.xworkz.service.orderDetail.OrderDetailServiceImpl;

public class OrderDetailRunner {
    public static void main(String[] args) {
        OrderDetailService orderDetailService = new OrderDetailServiceImpl();

        OrderDetailDTO orderDetailDTO = new OrderDetailDTO("Panner",05,7746L,true,false);

        orderDetailService.validateAndSave(orderDetailDTO);
    }
}
