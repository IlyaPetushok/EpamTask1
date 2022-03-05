package tests.java.by.petushokilya.parser;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.exception.CustomException;
import java.by.petushokilya.parser.impl.ArrayParserImpl;

public class ArrayParserTest {
    private static final ArrayParserImpl parser=new ArrayParserImpl();

    @Test
    public void ParserToStringTest() throws CustomException {
        String line="10;2;12;-5;0";
        int[] arrayActual=parser.parseToString(line);
        int[] arrayExcept={10,2,12,-5,0};
        Assert.assertEquals(arrayActual,arrayExcept,"Mistake parser from string");
    }
}
