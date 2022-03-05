package tests.java.by.petushokilya.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.service.impl.ArraySortServiceImpl;

public class ArraySortServiceTest {
    private static final CustomArray array = new CustomArray(10, 4, 23, 198, -5, -7, 2, 0);
    private static final ArraySortServiceImpl sort = new ArraySortServiceImpl();

    @Test
    public void SortService() {
        sort.bubleSortArray(array);
        int[] arrayExcept = {-7, -5, 0, 2, 4, 10, 23, 198};
        Assert.assertEquals(array,arrayExcept);
    }
}
