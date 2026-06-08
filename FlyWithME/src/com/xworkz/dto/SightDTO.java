package com.xworkz.dto;

import com.xworkz.constent.AttractionType;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SightDTO implements Serializable {
    private String whereTo;
    private LocalDate tripDate;
    private AttractionType attractionType;
}
