package com.devstack.pos.POS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id", updatable = false, nullable = false, columnDefinition="VARCHAR(36)")
    private UUID id;

    @Column(name="label", nullable = false, unique = true, length = 100)
    private String label;

    @Column(name = "description", length = 200)
    private String description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    private List<User> users;
}
