package tests.java.by.petushokilya.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayFindInServiceImpl;

public class ArrayFindInServiceTest {
    private static final CustomArray array =new CustomArray(10, 4, 23, 198, -5, -7, 2, 0);
    private static final ArrayFindInServiceImpl find=new ArrayFindInServiceImpl();
    @Test
    public void negativeQuantityArray() {
        Assert.assertEquals(array, 2 );
    }

    @Test
    public void postiveQuantityArray() {
        Assert.assertEquals(array, 5 );
    }

    @Test
    public void maxValueArray() {
        Assert.assertEquals(array, 198 );
    }

    @Test
    public void minValueArray() {
        Assert.assertEquals(array, -7);
    }
}
