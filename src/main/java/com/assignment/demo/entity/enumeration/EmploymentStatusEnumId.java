package com.assignment.demo.entity.enumeration;

public enum EmploymentStatusEnumId {

    EmpsFullTime ("Full-time Employed"),
    EmpsPartTime ("Part-time Employed"),
    EmpsSelf ("Self Employed"),
    EmpsHouse ("House-Person"),
    EmpsRetired ("Retired"),
    EmpsStudent ("Student"),
    EmpsUnemployed ("Unemployed");

    private final String value;
    EmploymentStatusEnumId(String value){this.value=value;}

    public String getValue(){
        return this.value;
    }
}
