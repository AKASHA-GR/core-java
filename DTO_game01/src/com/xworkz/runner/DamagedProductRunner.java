package com.xworkz.runner;

import com.xworkz.dto.DamagedProductDetailDTO;
import com.xworkz.service.damagedProductDetailDTO.DamagedProductService;
import com.xworkz.service.damagedProductDetailDTO.DamagedProductServiceImple;

public class DamagedProductRunner {
    public static void main(String[] args) {
        DamagedProductService damagedProductService = new DamagedProductServiceImple();

        DamagedProductDetailDTO damagedProductDetailDTO = new DamagedProductDetailDTO("Milk",02,80,5,360);

        damagedProductService.validatAndSave(damagedProductDetailDTO);
    }

}
