package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayCalculateServiceImpl;

public class SpecificationSumLess {
    private int sum;

    public SpecificationSumLess(int sum) {
        this.sum = sum;
    }

    public boolean specif(CustomArray array){
        boolean flag=false;
        ArrayCalculateServiceImpl calculateService =new ArrayCalculateServiceImpl();
        int sum=calculateService.sumArray(array);
        if(sum<this.sum){flag=true;}
        return flag;
    }
}
