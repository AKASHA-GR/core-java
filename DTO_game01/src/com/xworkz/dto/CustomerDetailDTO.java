package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class CustomerDetailDTO implements Serializable {

    private String customerName;
    private int customerID;
    private String customerEmail;
    private long customerPhone;
    private String customerAddress;

}
