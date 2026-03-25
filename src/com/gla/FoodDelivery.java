package com.gla;

class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        System.out.println(Thread.currentThread().getName() +
                " picked Order " + orderId + " from " + restaurant);

        try {
            System.out.println("Order " + orderId + " is In Transit");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + orderId + " Delivered");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Order " + orderId + " delivery time: " + (end - start) + " ms");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "Dominos", 2), "Agent1");
        Thread o2 = new Thread(new Order(2, "KFC", 3), "Agent2");
        Thread o3 = new Thread(new Order(3, "PizzaHut", 4), "Agent3");
        Thread o4 = new Thread(new Order(4, "BurgerKing", 2), "Agent4");
        Thread o5 = new Thread(new Order(5, "Subway", 3), "Agent5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(10);
        o5.setPriority(5);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}
