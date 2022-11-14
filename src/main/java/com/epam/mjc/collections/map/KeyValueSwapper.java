package com.epam.mjc.collections.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            if (!resultMap.containsKey(value)) {
                resultMap.put(value, key);
            } else {
                if (key < resultMap.get(value))
                    resultMap.put(value, key);
            }
        });
        return resultMap;
    }
}
