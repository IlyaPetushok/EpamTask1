package java.by.petushokilya.util;

public class GeneratorIdUtil {
    private static int id=0;

    public GeneratorIdUtil() {
    }

    public static int generateId(){
        return id++;
    }
}
