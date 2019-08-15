package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator Calc = new Calculator();

        if (Calc.add(2,4) == 6){
            System.out.println("Dodawanie poprawne");
        } else {
            System.out.println("Błąd dodawania");
        }

        if (Calc.substract(10,5) == 6) {
            System.out.println("Odejmowanie poprawne");
        } else{
            System.out.println("Błąd odejmowania");
        }



    }
}