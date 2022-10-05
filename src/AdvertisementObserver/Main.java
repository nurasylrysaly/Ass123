package AdvertisementObserver;

public class Main {

    public static void main(String[] args) {

        NewAdvertisement newAdvertisement = new NewAdvertisement();

        Subscriber subscriber = new Subscriber("Ainagul", newAdvertisement);
        Subscriber Subscriber2 = new Subscriber("Talgat", newAdvertisement);
        Subscriber Subscriber3 = new Subscriber("Alexey", newAdvertisement);
        Subscriber Subscriber4 = new Subscriber("Tom", newAdvertisement);

        newAdvertisement.setNewAdvertisement("\"A new advertisement has been released!\"");


    }
}
