package com.xworkz.service.cab;

import com.xworkz.dao.CabSearch.CabDAO;
import com.xworkz.dto.CabDTO;

import java.util.Objects;

public class CabServiceImpl implements CabService{

    private CabDAO cabDAO;

    public CabServiceImpl(CabDAO cabDAO) {
        this.cabDAO = cabDAO;
    }

    @Override
    public boolean validateAndSearch(CabDTO cabDTO) {
        if(Objects.nonNull(this.cabDAO)){
            System.out.println("Dao is not null");
            if(Objects.nonNull(cabDTO)){
                System.out.println("cab dto is not null we can validate and search.");
            }else{
                System.out.println("Cab dto is null,we can not validate and search.");
            }
        }else {
            System.out.println("Dao is null.");
        }
        return false;
    }
}
