package java.by.petushokilya.service;

import java.by.petushokilya.entity.CustomArray;
import java.util.OptionalDouble;

public interface ArrayCalculateService {
    int sumArray(CustomArray array);

    double averageArray(CustomArray array);

    OptionalDouble averageArrayOpt(CustomArray array);
}
