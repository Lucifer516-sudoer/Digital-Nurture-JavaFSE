package com.dn5.spring.ioc;

import java.util.HashMap;
import java.util.Map;

public class SimpleContainer {

    // Our cupboard.
    // Key -> Class label
    // Value -> Actual object
    private final Map<Class<?>, Object> box = new HashMap<>();

    /**
     * Store an object in the container.
     */
    public boolean register(Object object) {

        Class<?> label = object.getClass();

        if (box.containsKey(label)) {
            return false;
        }

        box.put(label, object);
        return true;
    }

    /**
     * Retrieve an object from the container.
     */
    public Object get(Class<?> clazz) {
        return box.get(clazz);
    }
}