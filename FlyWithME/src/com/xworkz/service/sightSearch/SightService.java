package com.xworkz.service.sightSearch;

import com.xworkz.dto.SightDTO;

public interface SightService {
    boolean validateAndSave(SightDTO sightDTO);
}
