package com.taltech.ecommerce.orderservice.dto.payment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentItemDto {

    private String inventoryCode;
    private BigDecimal quantity;
    private BigDecimal price;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;
}
