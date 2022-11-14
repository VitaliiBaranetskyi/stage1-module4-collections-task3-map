package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();
        if(sentence == null || sentence.equals(""))
            return new HashMap<>();
        String[] splitSentence = sentence.toLowerCase().split("\\W+");
        for(String s:splitSentence){
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else{
                map.put(s, map.get(s)+1);
            }

        }
        return map;
    }
}
