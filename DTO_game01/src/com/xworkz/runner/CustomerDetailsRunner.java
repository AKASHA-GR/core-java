package com.xworkz.runner;

import com.xworkz.dto.CustomerDetailDTO;
import com.xworkz.service.customerDetail.CustomerDetailsService;
import com.xworkz.service.customerDetail.CustomerDetailsServiceImpl;

public class CustomerDetailsRunner {
    public static void main(String[] args) {
        CustomerDetailsService customerDetailsService = new CustomerDetailsServiceImpl();

        CustomerDetailDTO customerDetailDTO = new CustomerDetailDTO("Navya",01,"navya@hgmail.com",8430979304L,"Bengaluru");
        customerDetailsService.validateAndSave(customerDetailDTO);
    }
}
