package com.assignment.demo.entity;

import com.assignment.demo.entity.enumeration.EmploymentStatusEnumId;
import com.assignment.demo.entity.enumeration.MaritalStatusEnumId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@ManyToOne(targetEntity = Party.class)
//    @JoinColumn(name="partyId")
    private Long partyId;
    private  String salutation;
    private String firstName;
    private  String middleName;
    private String lastName;
    private String gender;
    private String birthDate;
    private String occupation;
    private MaritalStatusEnumId maritalStatusEnumId;
    private EmploymentStatusEnumId employmentStatusEnumId;


}
