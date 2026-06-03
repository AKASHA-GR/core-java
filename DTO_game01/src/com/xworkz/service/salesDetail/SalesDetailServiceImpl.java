package com.xworkz.service.salesDetail;

import com.xworkz.dto.SalesDetailDTO;

public class SalesDetailServiceImpl implements SalesDetailService{
    @Override
    public void validateAndSave(SalesDetailDTO salesDetailDTO) {
        System.out.println("The validate and save the SalesDateDTO:"+salesDetailDTO);
    }
}
