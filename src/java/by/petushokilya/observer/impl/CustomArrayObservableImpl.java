package java.by.petushokilya.observer.impl;


import java.by.petushokilya.observer.CustomArrayEvent;
import java.by.petushokilya.observer.CustomArrayObservable;
import java.by.petushokilya.observer.CustomArrayObserver;
import java.util.ArrayList;
import java.util.List;

public class CustomArrayObservableImpl implements CustomArrayObservable {
    private List<CustomArrayObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(CustomArrayObserver observer) {
        if (observers != null) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(CustomArrayObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        for (CustomArrayObserver observer : observers) {
            observer.arrayChanged(event);
        }
    }
}
