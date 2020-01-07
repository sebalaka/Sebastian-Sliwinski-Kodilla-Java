package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> aiport = new HashMap<>();
        if (!airport.containsKey(flight.getDepartureAirport())||!airport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }
}
