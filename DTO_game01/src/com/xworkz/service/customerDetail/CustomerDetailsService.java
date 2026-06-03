package com.xworkz.service.customerDetail;

import com.xworkz.dto.CustomerDetailDTO;

public interface CustomerDetailsService {
    void validateAndSave(CustomerDetailDTO customerDetailDTO);
}
