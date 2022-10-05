package ResidentialDecorator;

public class BasicHome implements Home{

    @Override
    public void collect() {
        System.out.println("Basic home.");
    }
}
