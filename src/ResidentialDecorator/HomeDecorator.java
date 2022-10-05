package ResidentialDecorator;

public class HomeDecorator implements Home{

    protected Home home;

    public HomeDecorator(Home h){
        this.home=h;
    }

    @Override
    public void collect() {
        this.home.collect();
    }
}
