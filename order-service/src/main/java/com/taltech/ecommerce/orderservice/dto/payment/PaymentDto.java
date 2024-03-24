package com.taltech.ecommerce.orderservice.dto.payment;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentDto {

    private Long userId;
    private String code;
    private List<PaymentItemDto> paymentItems;
    private boolean active;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;
}
