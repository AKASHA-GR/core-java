package com.xworkz.dao.sightSearch;

import com.xworkz.dto.SightDTO;

public class SightDAOImpl implements SightDAO{
    @Override
    public boolean search(SightDTO sightDTO) {
        System.out.println("search sight from dao.");
        return false;
    }
}
