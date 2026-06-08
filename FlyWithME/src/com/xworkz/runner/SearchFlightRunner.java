package com.xworkz.runner;

import com.xworkz.dao.SearchFlightDAO;
import com.xworkz.dao.SearchFlightDAOImpl;
import com.xworkz.dto.SearchFlightDTO;
import com.xworkz.service.PlaneService;
import com.xworkz.service.PlaneServiceImpl;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlightDAO searchFlightDAO = new SearchFlightDAOImpl();

        SearchFlightDTO searchFlightDTO = new SearchFlightDTO();

        PlaneService planeService = new PlaneServiceImpl(searchFlightDAO);

        planeService.validateAndSearch(searchFlightDTO);
    }
}
