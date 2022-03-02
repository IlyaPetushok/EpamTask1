package java.by.petushokilya.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayStringValidator {
    private String regex = "(\\s)*(\\-)?([1-9]\\d*)(\\;)(\\s)*";

    public ArrayStringValidator() {
    }

    public boolean ArrayLineCorrect(String line) {
        boolean found;
        if (line == null) {
            found = false;
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            found = matcher.matches();
        }
        return found;
    }
}
