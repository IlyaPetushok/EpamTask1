package java.by.petushokilya.specification.impl;

import java.by.petushokilya.entity.CustomArray;

public class SpecificationId {
    private int id;

    public SpecificationId(int id) {
        this.id = id;
    }

    public boolean specif(CustomArray array) {
        return array.getId() == id;
    }
}
