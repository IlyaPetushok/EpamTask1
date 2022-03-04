package java.by.petushokilya.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayChangeService;

public class ArrayChangeServiceImpl implements ArrayChangeService {
    private static final Logger logger = LogManager.getLogger(ArrayChangeServiceImpl.class.getName());

    @Override
    public void changeByIndexArray(CustomArray array, int index, int value) {
        int[] arr = array.getArr();
        arr[index] = value;
        array.setArr(arr);
        logger.info("Change value by index in array happen was success");
    }

    @Override
    public void changeAllValueArray(CustomArray array, int value) {
        int[] arr = array.getArr();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        array.setArr(arr);
        logger.info("Change all value in array happen was success");
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
        logger.info("Change value on replace in array happen was success");
    }
}
