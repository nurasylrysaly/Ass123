package com.company;

public class KaspiStrategy implements PaymentStrategy{

    private String email;
    private String pw;

    public KaspiStrategy(String email, String pw){
        this.email=email;
        this.pw=pw;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Kaspi");
    }
}
