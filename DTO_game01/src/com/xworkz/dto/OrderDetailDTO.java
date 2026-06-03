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
public class OrderDetailDTO implements Serializable {
    private String productName;
    private int  productId;
    private long orderId;
    private boolean isOnlinePament;
    private boolean isCashMethod;
}
