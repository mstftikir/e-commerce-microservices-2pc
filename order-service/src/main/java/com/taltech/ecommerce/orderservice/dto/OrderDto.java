package com.taltech.ecommerce.orderservice.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto {

    private Long userId;
    private List<OrderItemDto> orderItems;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;
}
