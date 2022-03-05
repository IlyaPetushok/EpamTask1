package tests.java.by.petushokilya.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.by.petushokilya.validator.ArrayStringValidator;

public class ArrayValidatorTest {
    private static final ArrayStringValidator validator=new ArrayStringValidator();

    @Test
    public void LineCorrectTest(){
        String line="-1; 3;   10;-97; 12;1;";
        boolean valid=validator.ArrayLineCorrect(line);
        Assert.assertTrue(valid,"String is not valid");
    }
}
