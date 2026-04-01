package com.gla;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc"};
        int total = 0;
        for(String p : prices){
            try{
                int price = Integer.parseInt(p);
                total += price;
            }
            catch(NumberFormatException e){
                System.out.println("Invalid price: " + p);
            }
        }
        System.out.println("Total Price = " + total);
    }
}
