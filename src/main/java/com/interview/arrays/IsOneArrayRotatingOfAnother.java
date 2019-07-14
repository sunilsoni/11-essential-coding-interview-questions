package com.interview.arrays;

import java.util.Arrays;

public class IsOneArrayRotatingOfAnother {

    public   boolean isOneArrayRotationOfAnOther1(int[] a, int[] b) {
        // ↓ sort two array in ascending order first, then compare them
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        }

        return false;
    }

    // ↓ the second answer
    public   boolean isOneArrayRotationOfAnOther2(int[] array1, int[] array2) {
        // ↓ 1, check two length are equal
        if (array1.length != array2.length) return false;
        int key = array1[0];
        int keyLoc = -1;

        // ↓ 2, Find corresponding index location of array1[0]
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == key) {
                keyLoc = i;
                System.out.println(keyLoc);
                break;
            }
        }

        // ↓ 3, If we can't find array1[0] in array2, then return false
        if (keyLoc == -1) return false;

        // ↓ 4, Loop through array1, if we find two elements in array1 and array 2 are not equal
        //      then return false
        for (int i = 0; i < array1.length; i++) {
            int j = (keyLoc + i) % array1.length;
            if (array1[i] != array2[j]) return false;
        }
        return true;
    }
}
