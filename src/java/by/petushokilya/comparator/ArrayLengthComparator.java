package java.by.petushokilya.comparator;

import java.by.petushokilya.entity.CustomArray;
import java.util.Comparator;

public class ArrayLengthComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int lengthArr = Integer.compare(o1.getArr().length, o2.getArr().length);
        return lengthArr;
    }
}
