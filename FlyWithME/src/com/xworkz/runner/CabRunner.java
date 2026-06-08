package com.xworkz.runner;

import com.xworkz.dao.CabSearch.CabDAO;
import com.xworkz.dao.CabSearch.CabDAOImpl;
import com.xworkz.dto.CabDTO;
import com.xworkz.service.cab.CabService;
import com.xworkz.service.cab.CabServiceImpl;

public class CabRunner {
    public static void main(String[] args) {
        CabDTO cabDTO = new CabDTO();

        CabDAO cabDAO = new CabDAOImpl();

        CabService cabService = new CabServiceImpl(cabDAO);
        cabService.validateAndSearch(cabDTO);
    }
}
