package com.xworkz.service.expiredProductDetail;

import com.xworkz.dto.ExpiredProductDetailDTO;

public interface ExpiredProductService {
    void validateAndSave(ExpiredProductDetailDTO expiredProductDetailDTO);
}
