package ResidentialDecorator;

public class EconomyHome extends HomeDecorator{
    public EconomyHome(Home h) {
        super(h);
    }

    @Override
    public void collect(){
        super.collect();
        System.out.print(" Adding Economy Class functions at home.");
    }
}
