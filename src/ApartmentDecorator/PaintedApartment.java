package ApartmentDecorator;

public class PaintedApartment extends ApartmentDecorator{
    public PaintedApartment(Apartment a) {
        super(a);
    }

    @Override
    public void collect(){
        super.collect();
        System.out.print(" Adding the painted apartment features.");
    }
}
