
package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //GIVEN
        int[] intArray = {1,2,3};
        double expectedAverage = 2;

        //WHEN
        double result = ArrayOperations.getAverage(intArray);

        //THEN
        assertEquals(expectedAverage, result,1);
    }
}