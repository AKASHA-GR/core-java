package com.xworkz.service.damagedProductDetailDTO;

import com.xworkz.dto.DamagedProductDetailDTO;

public class DamagedProductServiceImple implements DamagedProductService{
    @Override
    public void validatAndSave(DamagedProductDetailDTO damagedProductDetailDTO) {
        System.out.println("The damagedProductDetailDTO is validated and Saved:"+damagedProductDetailDTO);
    }
}
