package com.example.salman.beeradvisor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


/**
 * Created by Salman on 9/30/2017.
 */

public class BeerExpert {

    public List<String> getBrands(String color) {

        List<String> brands = new ArrayList<String>();

        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");

        } else {
            brands.add("Jale Pale Ale");
            brands.add("Gout Scout");
        }

        return brands;
    }
}