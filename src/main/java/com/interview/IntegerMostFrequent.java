package com.interview;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class IntegerMostFrequent {

    public int mostFrequent(int[] input) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int max = 0;
        int maxElementIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if (countMap.containsKey(input[i])) {
                countMap.put(input[i], countMap.get(input[i]) + 1);
                if (countMap.get(input[i]) > max) {
                    max = countMap.get(input[i]);
                    maxElementIndex = i;
                }
            } else {
                countMap.put(input[i], 1);
            }
        }
        log.info("maxElementIndex: {} ",maxElementIndex);
        return input[maxElementIndex];
    }
}
