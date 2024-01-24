package com.assignment.demo.entity;

import com.assignment.demo.entity.enumeration.ItemTypeEnumId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class OrderItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(targetEntity = OrderHeader.class)
    @JoinColumn(name="orderId")
    private Long orderId;
    private Long orderItemSeqId;
    private Long orderPartSeqId;
    private Long productId;
    private Long itemDescription;
    private Long quantity;
    private ItemTypeEnumId itemTypeEnumId;
    private Long unitAmount;
    private Long parentItemSeqId;
    @OneToMany(mappedBy = "productId",cascade=CascadeType.ALL,targetEntity = Product.class)
    private List<Product> products;
}
