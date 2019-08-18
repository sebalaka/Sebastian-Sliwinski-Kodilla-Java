package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> even = new ArrayList<Integer>();

        ArrayList<Integer> emptyList = new ArrayList<Integer>(oddNumbersExterminator.exterminate(even));

        Assert.assertEquals(emptyList.size(), 0);

        System.out.println ("List is empty" );
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> exterminatedNumbers = oddNumbersExterminator.exterminate(numbers);
        ArrayList<Integer> correctNumbers = new ArrayList<Integer>();
        correctNumbers.add(2);
        correctNumbers.add(4);
        Assert.assertEquals(correctNumbers, exterminatedNumbers);
    }
}
