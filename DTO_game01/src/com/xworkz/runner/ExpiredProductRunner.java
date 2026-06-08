package com.xworkz.runner;

import com.xworkz.dto.ExpiredProductDetailDTO;
import com.xworkz.service.expiredProductDetail.ExpiredProductService;
import com.xworkz.service.expiredProductDetail.ExpiredProductServiceImpl;

public class ExpiredProductRunner {
    public static void main(String[] args) {
        ExpiredProductService expiredProductService = new ExpiredProductServiceImpl();

        ExpiredProductDetailDTO expiredProductDetailDTO = new ExpiredProductDetailDTO("Panner",77,12,"29-3-2026",1440);

        expiredProductService.validateAndSave(expiredProductDetailDTO);
    }
}
