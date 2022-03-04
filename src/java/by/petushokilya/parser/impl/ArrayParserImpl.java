package java.by.petushokilya.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.by.petushokilya.exception.CustomException;
import java.by.petushokilya.parser.ArrayParser;
import java.by.petushokilya.validator.ArrayStringValidator;
import java.util.Arrays;


public class ArrayParserImpl implements ArrayParser {

    private static final Logger logger = LogManager.getLogger(ArrayParserImpl.class.getName());
    private String splitRegex = ";";

    public ArrayParserImpl() {
    }

    @Override
    public int[] parseToString(String line) throws CustomException {
        ArrayStringValidator validator = new ArrayStringValidator();
        int[] result = null;
        if (validator.ArrayLineCorrect(line)) {
            if (!line.isBlank()) {
                String[] numbers = line.split(splitRegex);
                result = Arrays.stream(numbers)
                        .mapToInt(Integer::parseInt)
                        .toArray();
            } else {
                return new int[0];
            }
        } else {
            logger.error("String is not valid");
            throw new CustomException("String isn't valid");
        }
        logger.info("Parsing end success");
        return result;
    }
}
