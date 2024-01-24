package com.assignment.demo.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(targetEntity = OrderItem.class)
    //@JoinColumn(name="productId")
    private Long productId;
    private Long ownerPartyId;
    private String productName;
    private String description;
    private Long chargeShipping;
    private boolean returnable;
}
