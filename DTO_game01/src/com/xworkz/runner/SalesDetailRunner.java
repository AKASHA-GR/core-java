package com.xworkz.runner;

import com.xworkz.dto.SalesDetailDTO;
import com.xworkz.service.salesDetail.SalesDetailService;
import com.xworkz.service.salesDetail.SalesDetailServiceImpl;

import java.time.LocalDate;

public class SalesDetailRunner {
    public static void main(String[] args) {
        SalesDetailService salesDetailService = new SalesDetailServiceImpl();
        LocalDate today = LocalDate.now();
        SalesDetailDTO salesDetailDTO = new SalesDetailDTO("Naditha","Butter",234,78.9,today);

        salesDetailService.validateAndSave(salesDetailDTO);
    }
}
