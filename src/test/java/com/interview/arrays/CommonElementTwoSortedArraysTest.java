package com.interview.arrays;

import com.interview.arrays.CommonElementTwoSortedArrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class CommonElementTwoSortedArraysTest {


    CommonElementTwoSortedArrays commonElements;

    @Before
    public void init(){
        commonElements = new CommonElementTwoSortedArrays();
    }

    @Test
    public void commonElementsTest() {
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        System.out.println("Common elements in array1 : " + Arrays.toString(array1A) + " and array2: " + Arrays.toString(array2A) +
                " are " + Arrays.toString(commonElements.commonElements(array1A, array2A)));

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
        System.out.println("Common elements in array1 : " + Arrays.toString(array1B) + " and array2: " + Arrays.toString(array2B) +
                " are " + Arrays.toString(commonElements.commonElements(array1B, array2B)));

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        System.out.println("Common elements in array1 : " + Arrays.toString(array1C) + " and array2: " + Arrays.toString(array2C) +
                " are " + Arrays.toString(commonElements.commonElements(array1C, array2C)));

    }
}
