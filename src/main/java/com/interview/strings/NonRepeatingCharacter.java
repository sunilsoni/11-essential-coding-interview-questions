package com.interview.strings;

import java.util.HashMap;

public class NonRepeatingCharacter {

    public  Character nonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
//        loop through the string, store each key with its count
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
//        loop again, if any count equals to 1, then return it
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return null;
    }

    public  Character nonRepeating2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                Integer newValue = map.get(c);
                map.put(c, newValue + 1);
            }
        }

        for (char c: s.toCharArray()){
            if(map.get(c) == 1)
                return c;
        }
        return null;
    }


    public  Character nonRepeating3(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        // NOTE: Using s.toCharArray() is no the most efficient method,
        // but I chose to use it here for simplicity.
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                Integer newVal = charCount.get(c) + 1;
                charCount.put(c, newVal);
            } else {
                charCount.put(c, 1);
            }
        }
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) return c;
        }
        return null;
    }
}
