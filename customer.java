package com.moducommerce.customer;

public class customer {
    private String name;
    private String email;

    public customer(String name , String email){
        this.name=name;
        this.email=email;
    }

    public void displayInfo(){
        System.out.println("Customer name:"+name);
        System.out.println("Customer email"+email);
        
    }
    
}
