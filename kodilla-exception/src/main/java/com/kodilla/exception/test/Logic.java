package com.kodilla.exception.test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Logic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> aiport = new HashMap<>();
        aiport.put("Pyrzowice", true);
        aiport.put("Balice", false);
        aiport.put("Doha",false);
        aiport.put("Frankfurt",true);

        public HashMap<Flight> getList() {
            return new HashMap<Flight>(Flight flight);
        }

    }

    public static void main(String[] args) {

        HashMap<String, Book> test = aiport.getList().stream()
                .filter(book -> book.test() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + aiport.size());

        aiport.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
