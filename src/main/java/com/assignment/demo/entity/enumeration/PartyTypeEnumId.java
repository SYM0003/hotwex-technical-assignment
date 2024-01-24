package com.assignment.demo.entity.enumeration;


public enum PartyTypeEnumId {

    PtyAutomatedAgent ("Automated Agent"),
    PtyPerson ("Person"),
    PtyOrganization ("Organization");

    private  final String value;
    PartyTypeEnumId(String value){this.value=value;}

    public String getValue(){
        return this.value;
    }


}
