package java.by.petushokilya.comparator;

import java.by.petushokilya.entity.CustomArray;
import java.util.Comparator;

public class ArrayFirstElementComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int firstElm = Integer.compare(o1.getArr()[0], o2.getArr()[0]);
        return firstElm;
    }
}
