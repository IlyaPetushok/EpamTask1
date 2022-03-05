package tests.java.by.petushokilya.reader;

import org.testng.annotations.Test;

import java.by.petushokilya.exception.CustomException;
import java.by.petushokilya.reader.impl.ArrayReaderImpl;
import java.util.Arrays;
import java.util.List;

public class ArrayReaderTest {
    private static final ArrayReaderImpl reader =new ArrayReaderImpl();

    @Test
    public void ReadStringFromFile() throws CustomException {
        String path="D:\\Java\\Epam\\java\\EpamTask1\\src\\tests\\resources\\ArrayReader.txt";
        List<String> actual =  reader.readStringFromFile(path);
        List<String> except= Arrays.asList("10;-2;13;");
    }
}
