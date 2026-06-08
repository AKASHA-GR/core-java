package com.xworkz.service.sightSearch;

import com.xworkz.dao.sightSearch.SightDAO;
import com.xworkz.dto.SightDTO;

import java.util.Objects;

public class SightServiceImpl implements SightService{

    private SightDAO sightDAO;

    public SightServiceImpl(SightDAO sightDAO) {
        this.sightDAO = sightDAO;
    }

    @Override
    public boolean validateAndSave(SightDTO sightDTO) {
        if(Objects.nonNull(this.sightDAO)){
            System.out.println("DAO is not null.");
            if(Objects.nonNull(sightDTO)){
                System.out.println("sightDTO is not null we will validate and search.");
            }else{
                System.out.println("sightDTO is null cannot validate and search.");
            }

        }else {
            System.out.println("sight DAO is null cannot search.");
        }
        return false;
    }
}
