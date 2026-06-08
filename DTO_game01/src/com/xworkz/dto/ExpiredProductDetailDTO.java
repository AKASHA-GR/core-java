package com.xworkz.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ExpiredProductDetailDTO {
    private String productName;
    private int productId;
    private int numberOfItem;
    private String expiredDate;
    private int loss;
}
