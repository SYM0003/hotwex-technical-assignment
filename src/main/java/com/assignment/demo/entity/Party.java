package com.assignment.demo.entity;

import com.assignment.demo.entity.enumeration.PartyTypeEnumId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PartyId;
    private PartyTypeEnumId PartyTypeId;
    @OneToMany(mappedBy = "customerPartyId",targetEntity = OrderPart.class)
    private List<OrderPart> orderParts;

    @OneToMany(mappedBy = "partyId",targetEntity = Person.class)
    private List<Person> PersonList;

}
