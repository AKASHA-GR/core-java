package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sun.util.resources.LocaleData;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SalesDetailDTO implements Serializable {
    private String personName;
    private String productName;
    private int productId;
    private double productCost;
    private LocalDate data;
}
