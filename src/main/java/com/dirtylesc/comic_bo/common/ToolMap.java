package com.dirtylesc.comic_bo.common;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ToolMap {
    public static Map<String, String> convertUsingReflection(Object object) throws IllegalAccessException {
        Map<String, String> map = new HashMap<>();
        Field[] fields          = object.getClass().getDeclaredFields();

        for (Field field: fields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(object).toString());
        }

        return map;
    }
}
