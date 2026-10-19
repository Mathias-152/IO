package edu.arch.shop.customer.dto;

import java.math.BigDecimal;

public record CustomerResponse(
        Long id,
        String customerName
) {
}
