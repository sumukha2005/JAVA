package com.moducommerce.order;

public class order {
    private String orderId;
    private double amount;

    public order(String orderId, double amount){
        this.orderId=orderId;
        this.amount=amount;
    }
    public void displayOrder(){
        System.out.print("Order ID:"+orderId);
        System.out.println("Order Amount:"+amount);
    }
}
