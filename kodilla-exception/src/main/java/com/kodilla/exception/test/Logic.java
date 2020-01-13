package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> aiport = new HashMap<>();
        aiport.put("Pyrzowice", true);
        aiport.put("Balice", false);
        aiport.put("Doha", false);
        aiport.put("Frankfurt", true);

        for (Map.Entry<String, Boolean> entry : aiport.entrySet()) {
            if (aiport.containsKey(flight.getDepartureAirport())) {
                return aiport.get(flight.getDepartureAirport());
            } else {
                throw new RouteNotFoundException("This airport is not supported");
            }
        }
        return aiport.get(aiport.entrySet().contains(flight.getDepartureAirport()));
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Pyrzowice", "Frankfurt");
        Logic flightChecker = new Logic();

        try {
            flightChecker.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("The flight has not been found");
        } finally {
            System.out.println("Program is working");
        }
    }
}


