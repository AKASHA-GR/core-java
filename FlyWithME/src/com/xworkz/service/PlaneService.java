package com.xworkz.service;

import com.xworkz.dto.SearchFlightDTO;

public interface PlaneService {
    boolean validateAndSearch(SearchFlightDTO searchFlightDTO);
}
