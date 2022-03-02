package java.by.petushokilya.entity;

import java.util.Arrays;

public class CustomArray {
    private int arr[];

    public CustomArray() {
    }

    public CustomArray(int... arr) {
        this.arr = arr;
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
