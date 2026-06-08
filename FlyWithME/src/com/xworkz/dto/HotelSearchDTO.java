package com.xworkz.dto;

import com.xworkz.constent.SearchType;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class HotelSearchDTO implements Serializable {
    private SearchType searchType;
    private String destination;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int noOfGuest;
    private int noOfRoom;
}
