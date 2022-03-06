package java.by.petushokilya.service;

import java.by.petushokilya.entity.CustomArray;
import java.util.OptionalInt;

public interface ArrayFindInService {
    int negativeQuantityArray(CustomArray array);

    int postiveQuantityArray(CustomArray array);

    int maxValueArray(CustomArray array);

    int minValueArray(CustomArray array);

    OptionalInt maxValueArrayOpt(CustomArray array);

    OptionalInt minValueArrayOpt(CustomArray array);
}
