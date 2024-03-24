package com.taltech.ecommerce.paymentservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class PaymentDto {

    private Long userId;
    private String code;
    private List<PaymentItemDto> paymentItems;
    private BigDecimal totalPrice;
    private String discountId;
    private boolean active;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;
}
