package java.by.petushokilya.observer;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.observer.impl.CustomArrayObservableImpl;
import java.util.EventObject;

public class CustomArrayEvent extends EventObject {
    public CustomArrayEvent(CustomArrayObservableImpl source) {
        super(source);
    }

    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
