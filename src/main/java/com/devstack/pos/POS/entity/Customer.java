package com.devstack.pos.POS.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="customer")
public class Customer {
    private UUID id;
    private String address;
}
