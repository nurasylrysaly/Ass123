package com.company;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cvv;
    private String cardNum;
    private String dateExpiry;

    public CreditCardStrategy(String name, String cvv, String cardNum, String dateExpiry){
        this.name=name;
        this.cvv=cvv;
        this.cardNum=cardNum;
        this.dateExpiry=dateExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
