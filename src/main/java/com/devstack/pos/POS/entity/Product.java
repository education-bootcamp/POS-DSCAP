package com.devstack.pos.POS.entity;

import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id", updatable = false, nullable = false, columnDefinition="VARCHAR(36)")
    private UUID id;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "unit_price", precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "qty_on_hand")
    private int qtyOnHand;
}
