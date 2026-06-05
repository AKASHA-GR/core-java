package com.xworkz.runner;

import com.xworkz.dto.KMFDetailsDTO;
import com.xworkz.service.kmfDetails.KMFDetailsService;
import com.xworkz.service.kmfDetails.KMFDetailsServiceImpl;

public class KMFDetailsRunner {
    public static void main(String[] args) {
        KMFDetailsService kmfDetailsService = new KMFDetailsServiceImpl();

        KMFDetailsDTO kmfDetailsDTO = new KMFDetailsDTO("Nandini","milk",6,54,25000);

        kmfDetailsService.validateAndSave(kmfDetailsDTO);
    }

}
