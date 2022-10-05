package DiscountPurchase;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int way = 0;
        System.out.println("Write today's holiday: 1)New Year   2)Anniversary");
        Scanner reader = new Scanner(System.in);
        way = reader.nextInt();

        if(way == 1){
            new NewYearDiscounter().applyDiscount(6500);
        } else if(way == 2){
            new AnniversaryDiscounter().applyDiscount(6500);
        } else{
            System.out.println("You won't get a discount");
        }
    }
}
