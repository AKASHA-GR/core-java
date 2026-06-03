package com.xworkz.service.orderDetail;

import com.xworkz.dto.OrderDetailDTO;

public interface OrderDetailService {
    void validateAndSave(OrderDetailDTO orderDetailDTO);
}
