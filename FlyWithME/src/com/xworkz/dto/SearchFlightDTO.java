package com.xworkz.dto;

import com.xworkz.constent.TripType;
import lombok.*;
import sun.util.resources.LocaleData;

import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SearchFlightDTO implements Serializable {
    private TripType tripType;
    private String from;
    private String to;
    private LocalDate departure;
    private LocalDate returnDate;
    private int passengers;
}
