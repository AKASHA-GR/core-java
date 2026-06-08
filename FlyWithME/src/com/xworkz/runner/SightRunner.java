package com.xworkz.runner;

import com.xworkz.dao.sightSearch.SightDAO;
import com.xworkz.dao.sightSearch.SightDAOImpl;
import com.xworkz.dto.SightDTO;
import com.xworkz.service.sightSearch.SightService;
import com.xworkz.service.sightSearch.SightServiceImpl;

public class SightRunner {
    public static void main(String[] args) {
        SightDAO sightDAO = new SightDAOImpl();

        SightDTO sightDTO = new SightDTO();

        SightService sightService = new SightServiceImpl(sightDAO);
        sightService.validateAndSave(sightDTO);
    }
}
