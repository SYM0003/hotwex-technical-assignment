package com.assignment.demo.entity.enumeration;

public enum MaritalStatusEnumId {

    MarsSingle ("Single"),
    MarsMarried ("Married"),
    MarsDivorced ("Divorced"),
    MarsWidow ("Widowed/Widower");

    private final String value;
    MaritalStatusEnumId(String value){this.value=value;}


    public String getValue(){return this.value;}
    }
