package com.company;

public class TravelAdministrator {

    public TravelAdministrator() {}

    public void init(TravelElement travelElement) {
        if(travelElement.isReady()) {
            travelElement.travel();
        }
    }
}

