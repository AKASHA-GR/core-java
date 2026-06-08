package com.xworkz.runner;

import com.xworkz.dao.searchFlight.SearchFlightDAO;
import com.xworkz.dao.searchFlight.SearchFlightDAOImpl;
import com.xworkz.dto.SearchFlightDTO;
import com.xworkz.service.planeSearch.PlaneService;
import com.xworkz.service.planeSearch.PlaneServiceImpl;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlightDAO searchFlightDAO = new SearchFlightDAOImpl();

        SearchFlightDTO searchFlightDTO = new SearchFlightDTO();

        PlaneService planeService = new PlaneServiceImpl(searchFlightDAO);

        planeService.validateAndSearch(searchFlightDTO);
    }
}
