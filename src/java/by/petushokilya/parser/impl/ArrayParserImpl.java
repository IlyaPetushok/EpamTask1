package java.by.petushokilya.parser.impl;

import java.by.petushokilya.exception.CustomException;
import java.by.petushokilya.parser.ArrayParser;
import java.by.petushokilya.validator.ArrayStringValidator;
import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {

    private String regex = "\\-?\\s*";

    public ArrayParserImpl() {
    }

    @Override
    public int[] parseToString(String line) throws CustomException {
        ArrayStringValidator validator = new ArrayStringValidator();
        int[] result = null;
        if (validator.ArrayLineCorrect(line)) {
            if (!line.isBlank()) {
                String[] numbers = line.split(regex);
                result = Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .toArray();
            } else {
                return new int[0];
            }
        } else {
            throw new CustomException("String isn't valid");
        }
        return result;
    }
}
