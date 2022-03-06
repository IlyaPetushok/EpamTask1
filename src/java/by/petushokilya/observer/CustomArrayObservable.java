package java.by.petushokilya.observer;

public interface CustomArrayObservable {
    void addObserver(CustomArrayObserver o);
    void removeObserver(CustomArrayObserver o);
    void notifyObserver();
}
