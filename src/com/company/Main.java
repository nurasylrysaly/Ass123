package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Items item1 = new Items("Hammer",2500);
        Items item2 = new Items("Nails",4000);

        cart.addItem(item1);
        cart.addItem(item2);

        int way = 0;
        System.out.println("Write how to pay purchase: 1)Kaspi   2)Credit card");
        Scanner reader = new Scanner(System.in);
        way = reader.nextInt();

        if(way == 1){
            cart.pay(new KaspiStrategy("nrusal@example.com", "qaz123"));
        } else if(way == 2){
            cart.pay(new CreditCardStrategy("Nurasyl Rysaly", "999", "4400 4301 7777", "02/24"));
        } else{
            System.out.println("Payment method entered incorrectly, purchase cancelled");
        }
    }
}
