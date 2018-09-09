package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TravelAdministrator {

    public TravelAdministrator() {}

    public void init(TravelElement travelElement) {
        if(travelElement.isReady()) {
            travelElement.travel();
        }
    }

    public void overBookTravels(List<OverbookTravel> overbookTravels, Seat seat) {
        for(int i = 0; i < overbookTravels.size(); i++) {
            overbookTravels.get(i).overBookSeat(seat);
        }
    }
}

