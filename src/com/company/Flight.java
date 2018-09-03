package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
    Date d, a;
    int minutes;
    ArrayList<FlightSeat> seats = new ArrayList<>();
    String type;

    public Flight(Date d, Date a, int minutes, String type) {
        // Do stuff to initialize values
    }

    public void fly() {
        //Do stuff to travel
    }

    //TODO Refactor this
    public ArrayList<FlightSeat> getFreeSeats() {
        ArrayList<FlightSeat> freeSeats = new ArrayList<>();
        for(int i = 0; i < seats.size(); i++) {
            FlightSeat tempSeat = this.seats.get(i);
            if(tempSeat.getFree()) {
                freeSeats.add(tempSeat);
            }
        }
        return freeSeats;
    }
}