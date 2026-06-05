package com.xworkz.service.kmfDetails;

import com.xworkz.dto.KMFDetailsDTO;

public class KMFDetailsServiceImpl implements KMFDetailsService{
    @Override
    public void validateAndSave(KMFDetailsDTO kmfDetailsDTO) {
        System.out.println("The validate and save the KMFDetailsDTO:"+kmfDetailsDTO);
    }
}
