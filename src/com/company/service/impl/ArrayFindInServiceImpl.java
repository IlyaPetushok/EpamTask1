package com.company.service.impl;

import com.company.entity.CustomArray;
import com.company.service.ArrayFindInService;

public class ArrayFindInServiceImpl implements ArrayFindInService {
    @Override
    public int negativeQuantityArray(CustomArray array) {
        int[]arr=array.getArr();
        int quantity=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int postiveQuantityArray(CustomArray array) {
        int[] arr=array.getArr();
        int quantity=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int maxValueArray(CustomArray array) {
        int[] arr=array.getArr();
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    @Override
    public int minValueArray(CustomArray array) {
        int[] arr=array.getArr();
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(minValue>arr[i]){
                minValue=arr[i];
            }
        }
        return minValue;
    }
}
