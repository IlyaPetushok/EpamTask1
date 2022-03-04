package java.by.petushokilya.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArraySortService;

public class ArraySortServiceImpl implements ArraySortService {

    private static final Logger logger = LogManager.getLogger(ArraySortServiceImpl.class.getName());

    @Override
    public void bubleSortArray(CustomArray array) {
        int[] arr = array.getArr();
        int value;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    value = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = value;
                    flag = true;
                }
            }
        }
        array.setArr(arr);
        logger.info("Buble sort array has been implemented");
    }

    @Override
    public void insertSortArray(CustomArray array) {
        int[] arr = array.getArr();
        int value, oporn;
        for (int i = 1; i < arr.length; i++) {
            oporn = i;
            for (int j = oporn - 1; j >= 0; j--) {
                if (arr[oporn] < arr[j]) {
                    value = arr[oporn];
                    arr[oporn] = arr[j];
                    arr[j] = value;
                    oporn = j;
                } else {
                    break;
                }
            }
        }
        array.setArr(arr);
        logger.info("Insert sort array has been implemented");
    }

    @Override
    public void selectionSortArray(CustomArray array) {
        int[] arr = array.getArr();
        int value, value_2, stepMin, step = 0;
        while (step != arr.length - 1) {
            value = arr[step];
            stepMin = step;
            for (int i = step; i < arr.length - 1; i++) {
                if (value > arr[i + 1]) {
                    value = arr[i + 1];
                    stepMin = i + 1;
                }
            }
            value_2 = arr[step];
            arr[step] = value;
            arr[stepMin] = value_2;
            step++;
        }
        array.setArr(arr);
        logger.info("Selection sort array has been implemented");
    }
}
