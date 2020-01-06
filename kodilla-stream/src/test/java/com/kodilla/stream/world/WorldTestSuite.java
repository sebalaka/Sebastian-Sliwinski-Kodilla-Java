package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //given
        Country country1 = new Country("Indie", new BigDecimal("1500000000"));
        Country country2 = new Country("Niemcy", new BigDecimal("80000000"));
        List<Country> asiaList = new ArrayList<>();
        asiaList.add(country1);
        List<Country> europaList = new ArrayList<>();
        europaList.add(country2);
        Continent asia = new Continent(asiaList);
        Continent europa = new Continent(europaList);
        List<Continent> worldList = new ArrayList<>();
        worldList.add(asia);
        worldList.add(europa);
        World world = new World(worldList);

        //when
        BigDecimal peopleGermanyIndia = world.getPeopleQuantity();

        //then
        Assert.assertEquals(new BigDecimal("1580000000"),peopleGermanyIndia);




    }



}