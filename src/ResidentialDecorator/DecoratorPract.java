package ResidentialDecorator;

public class DecoratorPract {
    public static void main(String[] args) {
        Home ecomonyHome = new EconomyHome(new BasicHome());
        ecomonyHome.collect();
        System.out.println("\n======");

        Home comfortBusinessHome = new ComfortHome(new BusinessHome(new BasicHome()));
        comfortBusinessHome.collect();
    }
}
