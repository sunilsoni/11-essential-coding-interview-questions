package com.interview;

import java.util.ArrayList;
import java.util.List;

public class CommonElementTwoSortedArrays {

    public  Integer[] commonElements(int[] array1, int[] array2) {

        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
            return null;
        }

        List<Integer> resultArray =  new ArrayList<>();
        int ptr1 = 0, ptr2 = 0;

        while (ptr1 < array1.length && ptr2 < array2.length) {

            if (array1[ptr1] == array2[ptr2]) {
                resultArray.add(array1[ptr1]);
                ptr1++;
                ptr2++;
            } else if (array1[ptr1] < array2[ptr2]) {
                ptr1++;
            } else {
                ptr2++;
            }
        }

        Integer[] result = new Integer[resultArray.size()];

        return resultArray.toArray(result);
    }
}
