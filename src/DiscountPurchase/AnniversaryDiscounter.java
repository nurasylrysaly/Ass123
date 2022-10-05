package DiscountPurchase;

public class AnniversaryDiscounter implements Discounter{

    @Override
    public void applyDiscount(int amount) {
        System.out.println("You have a discount for Anniversary!!! Discount: 30%");
        System.out.println("You have the price " + amount * 0.7);
    }
}
