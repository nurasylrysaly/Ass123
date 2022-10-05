package ApartmentDecorator;

public class ApartmentDecorator implements Apartment{

    protected Apartment apartment;

    public ApartmentDecorator(Apartment a){
        this.apartment=a;
    }
    @Override
    public void collect() {
        this.apartment.collect();
    }
}
