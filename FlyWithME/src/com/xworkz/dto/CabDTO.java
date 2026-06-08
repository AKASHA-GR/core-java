package com.xworkz.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter

public class CabDTO {
    private CabTripType cabTripType;
    private String from;
    private String to;
    private LocalDate pickupDate;
    private LocalDate pickupTime;
}
