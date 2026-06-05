package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class KMFDetailsDTO implements Serializable {

    private String brandName;
    private String productName;
    private double profit;
    private double margin;
    private int numberOfSalse;



}
