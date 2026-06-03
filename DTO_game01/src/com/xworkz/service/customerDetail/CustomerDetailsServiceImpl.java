package com.xworkz.service.customerDetail;

import com.xworkz.dto.CustomerDetailDTO;

public class CustomerDetailsServiceImpl implements CustomerDetailsService {
    @Override
    public void validateAndSave(CustomerDetailDTO customerDetailDTO) {
        System.out.println("Running validate and save to save the customer detail:"+ customerDetailDTO);
    }
}
