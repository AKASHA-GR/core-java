package com.xworkz.runner;

import com.xworkz.dao.hotelSearch.HotelSearchDAO;
import com.xworkz.dao.hotelSearch.HotelSearchDAOImpl;
import com.xworkz.dto.HotelSearchDTO;
import com.xworkz.service.hotelSearch.HotelSearchService;
import com.xworkz.service.hotelSearch.HotelSearchServiceImpl;

public class HotelSearchRunner {
    public static void main(String[] args) {
        HotelSearchDAO hotelSearchDAO = new HotelSearchDAOImpl();

        HotelSearchDTO hotelSearchDTO = new HotelSearchDTO();

        HotelSearchService hotelSearchService = new HotelSearchServiceImpl(hotelSearchDAO);
        hotelSearchService.validateAndSave(hotelSearchDTO);
    }
}
