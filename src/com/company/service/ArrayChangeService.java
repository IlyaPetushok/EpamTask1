package com.company.service;

import com.company.entity.CustomArray;

public interface ArrayChangeService {
    void changeByIndexArray(CustomArray array,int index,int value);

    void changeAllValueArray(CustomArray array,int value);

    void changeValueArray(CustomArray array,int value,int replace);
}
