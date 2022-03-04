package java.by.petushokilya.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayCalculateService;

public class ArrayCalculateServiceImpl implements ArrayCalculateService {
    private static final Logger logger = LogManager.getLogger(ArrayCalculateServiceImpl.class.getName());

    @Override
    public int sumArray(CustomArray array) {
        int[] arr = array.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        logger.info("Sum:" + sum);
        return sum;
    }

    @Override
    public double averageArray(CustomArray array) {
        int[] arr = array.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        logger.info("Average:" + sum / arr.length);
        return sum / arr.length;
    }
}
