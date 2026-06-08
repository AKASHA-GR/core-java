package com.xworkz.service.hotelSearch;

import com.xworkz.dao.hotelSearch.HotelSearchDAO;
import com.xworkz.dto.HotelSearchDTO;

import java.util.Objects;

public class HotelSearchServiceImpl implements HotelSearchService{

    private HotelSearchDAO hotelSearchDAO;

    public HotelSearchServiceImpl(HotelSearchDAO hotelSearchDAO) {
        this.hotelSearchDAO = hotelSearchDAO;
    }

    @Override
    public boolean validateAndSave(HotelSearchDTO hotelSearchDTO) {

        System.out.println("Validateandsave method is in Hotel service.");

        if(Objects.nonNull(this.hotelSearchDAO)){
            System.out.println("The DAO is not null,we can search.");

            if(Objects.nonNull(hotelSearchDTO)){
                System.out.println("The HotelDTO is not null, we can validte and search.");
            }else {
                System.out.println("The HotelDTO is null,we can not search.");
            }
        }else {
            System.out.println("The DAO is null,we can not search.");
        }
        return false;
    }
}
