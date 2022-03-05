package tests.java.by.petushokilya.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArrayChangeServiceImpl;

public class ArrayChangeServiceTest {
    private static final CustomArray array =new CustomArray(10, 4, 23, 198, -5, -7, 2, 0);
    private static final ArrayChangeServiceImpl change=new ArrayChangeServiceImpl();
    @Test
    public void ChangeAllValue(){
        int [] arrayExcept={11,11,11,11,11,11,11,11};
        change.changeAllValueArray(array,11);
        Assert.assertEquals(array, arrayExcept, "Mistake in method sum");
    }
}
