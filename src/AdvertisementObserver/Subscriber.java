package AdvertisementObserver;

public class Subscriber {

    private String name;

        public Subscriber(String name, Advertisement advertisement){
        this.name = name;
        advertisement.addAdvertisement(this);
    }

    void info(String advertisementInfo){
        System.out.println("Subscriber- "+name + " got a info "+ advertisementInfo);
    }
}
