package java.by.petushokilya;

import java.by.petushokilya.entity.CustomArray;
import java.by.petushokilya.exception.CustomException;
import java.by.petushokilya.reader.impl.ArrayReaderImpl;
import java.by.petushokilya.service.impl.ArraySortServiceImpl;

public class Main {

    public static void main(String[] args) throws CustomException {
        int [] arr=new int[]{1,2,3};
        CustomArray array =new CustomArray(arr);
        ArraySortServiceImpl service=new ArraySortServiceImpl();
        service.bubleSortArray(array);
    }
}
