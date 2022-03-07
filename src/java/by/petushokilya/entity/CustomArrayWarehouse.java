package java.by.petushokilya.entity;

import java.util.HashMap;
import java.util.Map;

public class CustomArrayWarehouse {
    private static Map<Integer, CustomArrayParametrs> array;

    public CustomArrayWarehouse() {
        array = new HashMap<>();
    }

    public static CustomArrayParametrs get(Integer id) {
        return array.get(id);
    }

    public CustomArrayParametrs put(int id, CustomArrayParametrs value) {
        return array.put(id, value);
    }

    public boolean remove(String key, CustomArrayParametrs value) {
        return array.remove(key, value);
    }
}
