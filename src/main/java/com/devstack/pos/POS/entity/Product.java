package com.devstack.pos.POS.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="product")
public class Product {
    private UUID id;
    private String description;
    private BigDecimal unitPrice;
    private int qtyOnHand;
}
