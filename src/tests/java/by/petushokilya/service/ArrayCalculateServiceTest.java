package tests.java.by.petushokilya.service;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.ArrayCalculateService;
import java.by.petushokilya.service.impl.ArrayCalculateServiceImpl;

public class ArrayCalculateServiceTest {
    private static final ArrayCalculateService calculate = new ArrayCalculateServiceImpl();
    private static final CustomArray customArray = new CustomArray(10, 4, 23, 198, -5, -7, 2, 0);

    @Test
    public void SumArray() {
        int actual = calculate.sumArray(customArray);
        int except = 225;
        Assert.assertEquals(actual, except, "Mistake in method sum");
    }

    @Test
    public void Average() {
        double actual = calculate.averageArray(customArray);
        double except = 112.5;
        Assert.assertEquals(actual, except, "Mistake in method sum");
    }
}
