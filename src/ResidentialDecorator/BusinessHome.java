package ResidentialDecorator;

public class BusinessHome extends HomeDecorator{
    public BusinessHome(Home h) {
        super(h);
    }

    @Override
    public void collect(){
        super.collect();
        System.out.print(" Adding Business Class functions at home.");
    }
}
