package java.by.petushokilya.entity;

import java.by.petushokilya.observer.impl.CustomArrayObserverImpl;
import java.by.petushokilya.util.GeneratorIdUtil;
import java.util.Arrays;

public class CustomArray extends CustomArrayObserverImpl {
    private int id;
    private int arr[];

    public CustomArray() {
        id = GeneratorIdUtil.generateId();
        arr = new int[0];
    }

    public CustomArray(int... arr) {
        id = GeneratorIdUtil.generateId();
        this.arr = arr;
    }

    public int getId() {
        return id;
    }

    public int getLengthArr() {
        return arr.length;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = result * 31 + Arrays.hashCode(arr);
        return result;
    }

}
