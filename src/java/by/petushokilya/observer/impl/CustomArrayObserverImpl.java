package java.by.petushokilya.observer.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.entity.CustomArrayParametrs;
import java.by.petushokilya.entity.CustomArrayWarehouse;
import java.by.petushokilya.observer.CustomArrayEvent;
import java.by.petushokilya.observer.CustomArrayObserver;
import java.by.petushokilya.service.impl.ArrayCalculateServiceImpl;
import java.by.petushokilya.service.impl.ArrayFindInServiceImpl;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserverImpl implements CustomArrayObserver {
    @Override
    public void arrayChanged(CustomArrayEvent event) {
        ArrayFindInServiceImpl findInService = new ArrayFindInServiceImpl();
        ArrayCalculateServiceImpl calculateService = new ArrayCalculateServiceImpl();
        CustomArray array = event.getSource();
        CustomArrayParametrs parameter = CustomArrayWarehouse.get(array.getId());
        OptionalInt min = findInService.minValueArrayOpt(array);
        OptionalInt max = findInService.maxValueArrayOpt(array);
        OptionalDouble average = calculateService.averageArrayOpt(array);
        int sum = calculateService.sumArray(array);
        parameter.setAverage(average);
        parameter.setMin(min);
        parameter.setSum(sum);
        parameter.setMax(max);
    }

    ;
}
