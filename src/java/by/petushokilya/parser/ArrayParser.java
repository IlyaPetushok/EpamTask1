package java.by.petushokilya.parser;

import java.by.petushokilya.exception.CustomException;

public interface ArrayParser {
    int[] parseToString(String line) throws CustomException;
}
