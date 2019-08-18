package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    ArrayList<Integer> even = new ArrayList<Integer>();

    public ArrayList <Integer> exterminate(ArrayList <Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        OddNumbersExterminator delete = new OddNumbersExterminator();

        ArrayList<Integer> result = delete.exterminate(numbers);
        System.out.println(result);
    }
}
