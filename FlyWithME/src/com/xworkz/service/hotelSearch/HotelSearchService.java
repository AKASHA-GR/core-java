package com.xworkz.service.hotelSearch;

import com.xworkz.dto.HotelSearchDTO;

public interface HotelSearchService {
    boolean validateAndSave(HotelSearchDTO hotelSearchDTO);
}
