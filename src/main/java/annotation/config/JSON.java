package annotation.config;

import annotation.JSONElement;
import annotation.JsonException;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class JSON {

    private JSON() {}

    public static String toJsonString(Object object)  {
        try {
            return getJsonString(object);
        } catch (Exception e) {
            throw new JsonException(e.getMessage());
        }
    }



    private static String getJsonString(Object object) throws IllegalArgumentException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JSONElement.class)) {
                jsonElementsMap.put(getKey(field), (String) field.get(object));
            }

        }

        String jsonString = jsonElementsMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }

    private static String getKey(Field field) {
        String value = field.getAnnotation(JSONElement.class)
                .value();
        return value.isEmpty() ? field.getName() : value;
    }
}
