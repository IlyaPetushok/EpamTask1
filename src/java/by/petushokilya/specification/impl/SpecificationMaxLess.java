package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayFindInServiceImpl;

public class SpecificationMaxLess {
    private int max;

    public SpecificationMaxLess(int max) {
        this.max = max;
    }

    public boolean specif(CustomArray array){
        boolean flag=false;
        ArrayFindInServiceImpl find =new ArrayFindInServiceImpl();
        int max= find.maxValueArray(array);
        if(max<this.max){flag=true;}
        return flag;
    }
}
