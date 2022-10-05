package ApartmentDecorator;

public class DecoratorPract {

    public static void main(String[] args) {
        Apartment painted = new PaintedApartment(new BasicApartment());
        painted.collect();
        System.out.println("\n========");

        Apartment paintedFurnishedApartment = new FurnishedApartment(new PaintedApartment(new BasicApartment()));
        paintedFurnishedApartment.collect();
    }
}
