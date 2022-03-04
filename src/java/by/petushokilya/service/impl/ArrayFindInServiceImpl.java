package java.by.petushokilya.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayFindInService;

public class ArrayFindInServiceImpl implements ArrayFindInService {
    private static final Logger logger = LogManager.getLogger(ArrayFindInServiceImpl.class.getName());


    @Override
    public int negativeQuantityArray(CustomArray array) {
        int[] arr = array.getArr();
        int quantity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                quantity++;
            }
        }
        logger.info("Negative quantity" + quantity);
        return quantity;
    }

    @Override
    public int postiveQuantityArray(CustomArray array) {
        int[] arr = array.getArr();
        int quantity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                quantity++;
            }
        }
        logger.info("Postive quantity" + quantity);
        return quantity;

    }

    @Override
    public int maxValueArray(CustomArray array) {
        int[] arr = array.getArr();
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        logger.info("Maxvalue in array" + maxValue);
        return maxValue;
    }

    @Override
    public int minValueArray(CustomArray array) {
        int[] arr = array.getArr();
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        logger.info("Minvalue in array" + minValue);
        return minValue;
    }
}
