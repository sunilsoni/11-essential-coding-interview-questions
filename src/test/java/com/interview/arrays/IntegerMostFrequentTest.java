package com.interview.arrays;

import com.interview.arrays.IntegerMostFrequent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

@Slf4j
public class IntegerMostFrequentTest {

    IntegerMostFrequent integerMostFrequent;

    @Before
    public void init(){
        integerMostFrequent = new IntegerMostFrequent();
    }

    @Test
    public void mostFrequentTest() {
        int[][] inputArray = {{1,3,1,3,2,1},{3,3,1,3,2,1},{},{0},{0, -1, 10, 10, -1, 10, -1, -1, -1, 1}};

        for (int[] inputArr : inputArray) {
            if (inputArr == null || inputArr.length == 0) {
                log.info("Input Array is empty!");
            } else {
                assertThat(inputArr, is(notNullValue()));
                log.info("The most frequent element of input array : " + Arrays.toString(inputArr) + " is [" + integerMostFrequent.mostFrequent(inputArr) + "]");
            }

        }
    }
}
