package java.by.petushokilya.service.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    @Override
    public int sumArray(CustomArray array) {
        int[] arr = array.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @Override
    public double averageArray(CustomArray array) {
        int[] arr = array.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
