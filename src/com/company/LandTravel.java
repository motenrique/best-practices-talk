package com.company;

import java.util.Date;

public class LandTravel extends Travel implements TravelElement {
    private int stops;

    public LandTravel(Date a, Date d, int minutes, int stops) {
        super(a, d, minutes);
        // Do stuff to initialize
    }

    public void travel() {
        // Do stuff to travel
    }

    public boolean isReady() {
        // Do stuff to check if land travel is able to roll
        //return false for demonstrating purposes
        return false;
    }
}


