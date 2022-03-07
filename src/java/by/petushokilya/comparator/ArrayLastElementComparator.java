package java.by.petushokilya.comparator;

import java.by.petushokilya.entity.CustomArray;
import java.util.Comparator;

public class ArrayLastElementComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int lastElm = Integer.compare(o1.getArr()[o1.getArr().length - 1], o2.getArr()[o2.getArr().length - 1]);
        return lastElm;
    }
}
