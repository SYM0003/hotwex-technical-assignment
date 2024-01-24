package com.assignment.demo.entity.enumeration;

public enum StatusId {
    OrderOpen ("Shopping cart (Tentative)"),
    OrderRequested ("Quote Requested by Customer"),
    OrderProposed ("Quote Proposed by Vendor"),
    OrderPlaced ("Placed by Customer"),
    OrderHold ("Held"),
    OrderProcessing ("Processing"),
    OrderApproved ("Approved"),
    OrderSent ("Sent"),
    OrderCompleted ("Completed"),
    OrderRejected ("Rejected by Vendor"),
    OrderCancelled ("Cancelled by Customer"),
    OrderWishList ("Wish List"),
    OrderGiftRegistry ("Gift Registry"),
    OrderAutoReorder ("Auto Reorder");

    private final String description;

    StatusId(String description){this.description=description;}

    public  String getDescription(){return this.description;}

}
