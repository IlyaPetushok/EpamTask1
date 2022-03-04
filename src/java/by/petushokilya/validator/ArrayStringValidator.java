package java.by.petushokilya.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayStringValidator {
    private static final Logger logger = LogManager.getLogger(ArrayStringValidator.class.getName());
    private String regex = "(\\s)*(\\-)?([1-9]\\d*)(\\;)(\\s)*";

    public ArrayStringValidator() {
    }

    public boolean ArrayLineCorrect(String line) {
        boolean found;
        if (line == null) {
            found = false;
            logger.error("line is null");
        } else {
            logger.debug("there is a check for correct");
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            found = matcher.matches();
        }
        return found;
    }
}
