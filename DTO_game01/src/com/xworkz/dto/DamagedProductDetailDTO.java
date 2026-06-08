package com.xworkz.dto;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class DamagedProductDetailDTO implements Serializable {
    private String productName;
    private int productId;
    private int totleItem;
    private int damagedItems;
    private int loss;
}
