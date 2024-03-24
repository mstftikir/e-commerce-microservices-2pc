package com.taltech.ecommerce.orderservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto {

    private Long userId;
    private List<OrderItemDto> orderItems;
    private BigDecimal totalPrice;
    private String discountId;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;
}
