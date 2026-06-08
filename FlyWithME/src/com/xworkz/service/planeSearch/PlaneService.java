package com.xworkz.service.planeSearch;

import com.xworkz.dto.SearchFlightDTO;

public interface PlaneService {
    boolean validateAndSearch(SearchFlightDTO searchFlightDTO);
}
