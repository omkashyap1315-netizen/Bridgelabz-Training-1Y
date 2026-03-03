package com.gla.OnlineFoodDeliverySystem;

public interface Discountable {

    double applyDiscount(double totalAmount);

    String getDiscountDetails();
}
