package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    TravelAdministrator administrator = new TravelAdministrator();

        List<OverbookTravel> overbookTravels = new LinkedList<>();

	    for(int j = 0; j < 200; j++) {
	        Date departure = new Date();
	        Date arrival = new Date();
	        int minutes = 180 + j;
	        String type = "One Way";

	        overbookTravels.add(new Flight(departure, arrival, minutes, type));
        }

        FlightSeat commonSeat = new FlightSeat();

	    overbookTravels = new ArrayList<>(overbookTravels);

        administrator.overBookTravels(overbookTravels, commonSeat);
    }
}


