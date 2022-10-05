package AdvertisementObserver;

public interface Advertisement {

     void addAdvertisement(Subscriber subscriber);

     void removeAdvertisement(Subscriber subscriber);

     void info();
}
