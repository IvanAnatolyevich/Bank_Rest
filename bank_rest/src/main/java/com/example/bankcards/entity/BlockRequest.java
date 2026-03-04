package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="block_requests")
public class BlockRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="block_requests_id")
    private int id;
    @Column
    private Card card;
    @Column
    private int requestedBy;
    @Column
    private LocalDateTime requestedAt;
    @Column
    private BlockedStatus blockedStatus;
}
