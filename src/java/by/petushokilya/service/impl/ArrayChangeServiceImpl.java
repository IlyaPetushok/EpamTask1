package java.by.petushokilya.service.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService {
    @Override
    public void changeByIndexArray(CustomArray array, int index, int value) {
        int[] arr = array.getArr();
        arr[index] = value;
        array.setArr(arr);
    }

    @Override
    public void changeAllValueArray(CustomArray array, int value) {
        int[] arr = array.getArr();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        array.setArr(arr);
    }

    @Override
    public void changeValueArray(CustomArray array, int value, int replace) {
        int[] arr = array.getArr();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == replace) {
                arr[i] = value;
            }
        }
        array.setArr(arr);
    }
}
