package com.assignment.demo.entity.enumeration;

public enum ItemTypeEnumId {

    ItemSales ("Sales"),
    ItemProduct ("Product"),
    ItemServiceProduct ("Service Product"),
    ItemRental ("Rental"),
    ItemRentalDeposit ("Rental Deposit"),
    ItemReplacement ("Replacement"),
    ItemSalesTax ("Sales Tax"),
    ItemVatTax("VAT Tax"),
    ItemShipping ("Shipping and Handling"),
    ItemShippingOther ("Other Shipping (Non-Inventory)"),
    ItemDiscountPromo ("Discount - Promotional"),
    ItemDiscountAppease ("Discount - Appeasement"),
    ItemSupplierDiscount ("Discount - Supplier"),
    ItemDiscount ("ItemDiscount"),
    ItemFee ("Fee"),
    ItemMiscCharge ("Miscellaneous Charge"),
    ItemInventory ("Asset - Inventory"),
    ItemAsset ("Asset - Fixed Asset"),
    ItemExpense ("Expense");

    private final String description;
    ItemTypeEnumId(String description){this.description=description;}

    String getDescription(){return this.description;}
}
