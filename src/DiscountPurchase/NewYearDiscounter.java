package DiscountPurchase;

public class NewYearDiscounter implements Discounter{

    @Override
    public void applyDiscount(int amount) {
        System.out.println("You have a discount for New Year!!! Discount 50%");
        System.out.println("You have the price " + amount * 0.5);
    }
}
