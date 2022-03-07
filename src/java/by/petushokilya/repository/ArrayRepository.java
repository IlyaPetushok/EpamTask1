package java.by.petushokilya.repository;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.specification.Specification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {

    private List<CustomArray> arrayList;

    public ArrayRepository() {
        arrayList = new ArrayList<>();
    }

    public int getSize() {
        return arrayList.size();
    }

    public boolean addArr(CustomArray array) {
        return arrayList.add(array);
    }

    public boolean removeArr(CustomArray array) {
        return arrayList.remove(array);
    }

    public CustomArray getElm(int index) {
        return arrayList.get(index);
    }

    public CustomArray setElm(int index, CustomArray array) {
        return arrayList.set(index, array);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> list = new ArrayList<CustomArray>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (specification.specific(arrayList.get(i))) {
                list.add(arrayList.get(i));
            }
        }
        return list;
    }

    public List<CustomArray> getAll() {
        return arrayList;
    }

    public boolean addAll(Collection<CustomArray> collection) {
        return arrayList.addAll(collection);
    }

    public boolean removeAll(Collection<CustomArray> collection) {
        return arrayList.removeAll(collection);
    }

    public void sort(Comparator<CustomArray> comparator) {
        arrayList.sort(comparator);
    }
}
