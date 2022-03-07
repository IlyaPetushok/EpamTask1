package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayFindInServiceImpl;

public class SpecificationMinMore {
    private int min;

    public SpecificationMinMore(int min) {
        this.min = min;
    }

    public boolean specif(CustomArray array){
        boolean flag=false;
        ArrayFindInServiceImpl find=new ArrayFindInServiceImpl();
        int min=find.minValueArray(array);
        if(min>this.min){flag=true;}
        return flag;
    }
}
