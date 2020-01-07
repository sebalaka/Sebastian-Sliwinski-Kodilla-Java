
package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int[] intArray = {1,2,3};
        double expectedAverage = 2;

        //when
        double result = ArrayOperations.getAverage(intArray);

        //then
        assertEquals(expectedAverage, result,1);
    }
}