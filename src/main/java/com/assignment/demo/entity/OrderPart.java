package com.assignment.demo.entity;

import com.assignment.demo.entity.enumeration.ShipmentMethodEnumId;
import com.assignment.demo.entity.enumeration.StatusId;
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
public class OrderPart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(targetEntity = OrderHeader.class)
    private Long orderId;
    private Long orderPartSeqId;
    private String partName;
    private StatusId statusId;
    private Long vendorPartyId;

    @ManyToOne(targetEntity = Party.class)
    @JoinColumn(name="customerPartyId")
    private Long customerPartyId;

    private Long partTotal;
    private Long facilityId;
    private ShipmentMethodEnumId shipmentMethodEnumId;

//    @JoinColumn(name="customerPartyId")
//    private List<Party> partyList;
}
