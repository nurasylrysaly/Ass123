package ApartmentDecorator;

public class BasicApartment implements Apartment{
    @Override
    public void collect() {
        System.out.println("Basic apartment.");
    }
}
