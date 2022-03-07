package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayFindInServiceImpl;

public class SpecificationMaxEquals {
    private int max;

    public SpecificationMaxEquals(int max) {
        this.max = max;
    }

    public boolean specif(CustomArray array){
        boolean flag=false;
        ArrayFindInServiceImpl find =new ArrayFindInServiceImpl();
        int max= find.maxValueArray(array);
        if(max==this.max){flag=true;}
        return flag;
    }
}
