package com.xworkz.service.expiredProductDetail;

import com.xworkz.dto.ExpiredProductDetailDTO;

public class ExpiredProductServiceImpl implements ExpiredProductService{

    @Override
    public void validateAndSave(ExpiredProductDetailDTO expiredProductDetailDTO) {
        System.out.println("The ExpiredProductDetailDTO is validated and saved:"+expiredProductDetailDTO);
    }
}
