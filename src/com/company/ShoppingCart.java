package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Items> items;

    public ShoppingCart(){
        this.items=new ArrayList<Items>();
    }

    public void addItem(Items item){
        this.items.add(item);
    }

    public void removeItem(Items item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Items item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
