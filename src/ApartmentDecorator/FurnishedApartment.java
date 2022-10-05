package ApartmentDecorator;

public class FurnishedApartment extends ApartmentDecorator{
    public FurnishedApartment(Apartment a) {
        super(a);
    }

    @Override
    public void collect(){
        super.collect();
        System.out.print(" Adding the furnished apartment features.");
    }
}
