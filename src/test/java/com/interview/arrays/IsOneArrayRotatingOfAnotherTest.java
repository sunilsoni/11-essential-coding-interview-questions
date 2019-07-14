package com.interview.arrays;

import com.interview.arrays.IsOneArrayRotatingOfAnother;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class IsOneArrayRotatingOfAnotherTest {


    IsOneArrayRotatingOfAnother isOneArrayRotatingOfAnother;

    @Before
    public void init(){
        isOneArrayRotatingOfAnother = new IsOneArrayRotatingOfAnother();
    }


    @Test
    public void isOneArrayRotationOfAnOther1Test() {
        int[] rotationArrayA = {1, 2, 3, 4, 5, 6, 7};
        int[] rotationArrayB = {4, 5, 6, 7, 1, 2, 3};

        log.info("1Is two arrays rotation of the other's? : " + isOneArrayRotatingOfAnother.isOneArrayRotationOfAnOther1(rotationArrayA, rotationArrayB));
    }

    @Test
    public void isOneArrayRotationOfAnOther2Test() {
        int[] rotationArrayA = {1, 2, 3, 4, 5, 6, 7};
        int[] rotationArrayB = {4, 5, 6, 7, 1, 2, 3};
        log.info("2Is two arrays rotation of the other's? : " + isOneArrayRotatingOfAnother.isOneArrayRotationOfAnOther2(rotationArrayA, rotationArrayB));

    }
}
