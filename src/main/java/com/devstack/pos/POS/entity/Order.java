package com.devstack.pos.POS.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="customer_order")
public class Order {
    private UUID id;
    private LocalDate date;
    private BigDecimal total;
}
