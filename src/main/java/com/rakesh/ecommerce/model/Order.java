package com.rakesh.ecommerce.model;

import lombok.Data;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private double total;
    private Instant createdAt;
}