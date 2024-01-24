package com.assignment.demo.entity.enumeration;

public enum SalesChannelEnumId {
    WEB("Web"),
    WEBEX("Web External"),
    POS("POS"),
    FAX("Fax"),
    PHONE("phone"),
    EMAIL("email"),
    POSTAL("postal"),
    AFFILIATE("Affiliate"),
    EBAY("eBay"),
    AMAZONE("Amazone"),
    EDI("edi"),
    OAGI("OAGIs"),
    TESTO("Test Order");
    private final String value;

    SalesChannelEnumId(String value){this.value=value;}
    public  String getValue(){return this.value;}

}
