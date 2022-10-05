package AdvertisementObserver;

import ObserverPract.Student;

import java.util.ArrayList;
import java.util.List;

public class NewAdvertisement implements Advertisement{

    private List<Subscriber> subscribersList;

    private String advertisementInfo;

    public NewAdvertisement(){
        subscribersList = new ArrayList<>();
    }
    public void setNewAdvertisement(String news) {
        this.advertisementInfo = news;
        info();
    }

    @Override
    public void addAdvertisement(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void removeAdvertisement(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void info() {
        for (Subscriber subscriber : subscribersList){
            subscriber.info(advertisementInfo);
        }
    }
}
