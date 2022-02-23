package com.company.entity;

import com.company.service.ArraySortService;
import com.company.service.impl.ArraySortServiceImpl;

import java.util.Arrays;

public class CustomArray {
    private int arr[];

    public CustomArray(){

    }
    public CustomArray(int... arr){
        this.arr=arr;

    }

    public int[] getArr() {
        return Arrays.copyOf(arr,arr.length);
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
