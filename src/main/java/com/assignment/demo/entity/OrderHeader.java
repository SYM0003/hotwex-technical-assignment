package com.assignment.demo.entity;

import com.assignment.demo.entity.enumeration.SalesChannelEnumId;
import com.assignment.demo.entity.enumeration.StatusId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class OrderHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private String orderName;
    private Date placedDate;
    private Date approvedDate;
    private StatusId statusId;
    private Long currencyUomId;
    private Long productStoreId;
    private SalesChannelEnumId salesChannelEnumId;

    @OneToMany(targetEntity = OrderItem.class,mappedBy = "orderId")
    private List<OrderItem> orderItems;
    @OneToMany(targetEntity = OrderPart.class,mappedBy = "orderId")
    private List<OrderPart> orderParts;
}
