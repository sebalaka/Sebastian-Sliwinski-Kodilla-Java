package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(3,4);
        } catch (Exception e) {
            System.out.println("Wyjatek" + " " + e);
        } finally {
            System.out.println("Test");
        }
    }
}
