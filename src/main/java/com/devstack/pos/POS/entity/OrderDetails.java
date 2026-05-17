package com.devstack.pos.POS.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="order_detail")
public class OrderDetails {
    private UUID id;
}
