package com.assignment.demo.entity.enumeration;

public enum ShipmentMethodEnumId {
    shipmentMethodEnumId ("Description"),
    ShMthNextDayPri ("Next Day Priority"),
    ShMthNextDay ("Next Day Standard"),
    ShMthSecondDay ("Second Day"),
    ShMthThirdDay ("Third Day"),
    ShMthGround ("Ground Parcel"),
    ShMthGroundCom ("Ground Commercial"),
    ShMthMotor ("Motor (Common Carrier)"),
    ShMthPickUp ("Customer Pick Up");



    private final String description;

    ShipmentMethodEnumId(String description){this.description=description;}

    public  String getDescription(){return this.description;}
}
