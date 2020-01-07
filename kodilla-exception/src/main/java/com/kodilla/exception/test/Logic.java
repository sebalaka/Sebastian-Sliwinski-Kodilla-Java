package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> aiport = new HashMap<>();
        aiport.put("Pyrzowice", true);
        aiport.put("Balice", false);
        aiport.put("Doha",false);
        aiport.put("Frankfurt",true);



    }
}
