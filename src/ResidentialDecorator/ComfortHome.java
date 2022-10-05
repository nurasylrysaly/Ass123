package ResidentialDecorator;

public class ComfortHome extends HomeDecorator{
    public ComfortHome(Home h) {
        super(h);
    }

    public void collect(){
        super.collect();
        System.out.print(" Adding the functions of a comfortable home.");
    }
}
