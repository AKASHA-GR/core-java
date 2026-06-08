package com.xworkz.service;

import com.xworkz.dao.SearchFlightDAO;
import com.xworkz.dto.SearchFlightDTO;

import java.util.Objects;

public class PlaneServiceImpl implements PlaneService{

    private SearchFlightDAO searchFlightDAO;

    public PlaneServiceImpl(SearchFlightDAO searchFlightDAO) {
        this.searchFlightDAO = searchFlightDAO;
    }

    @Override
    public boolean validateAndSearch(SearchFlightDTO searchFlightDTO) {
        System.out.println("Validating and Searching Plane Booking details");

        if(Objects.nonNull(this.searchFlightDAO)){
            System.out.println("Dao is not null");

            if(Objects.nonNull(searchFlightDTO)){
                System.out.println("SearchFlightDTO is not null we will validate before search");
            }else{
                System.out.println("PlaneSearchDTO is null cannot search");
            }
        }else {
            System.out.println("Dao is null cannot search");
        }
        return false;
    }
}
