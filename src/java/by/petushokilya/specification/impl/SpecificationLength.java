package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;

public class SpecificationLength {
    private int length;

    public SpecificationLength(int length) {
        this.length = length;
    }

    public boolean specif(CustomArray array){
        return array.getLengthArr()==length;
    }
}
