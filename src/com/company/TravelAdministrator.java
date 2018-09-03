package com.company;

import java.util.ArrayList;

public class TravelAdministrator {

    public TravelAdministrator() {}

    //TODO refactor name
    public void init(ArrayList<Travel> travels) {
        for(int i = 0; i < travels.size(); i++) {
            Travel tempTravel = travels.get(i);

            Class travelClass = tempTravel.getClass();

            switch (travelClass.getName()) {
                case "Flight":
                    if(((Flight)tempTravel).ableToFly())
                        ((Flight)tempTravel).fly();
                    break;
                case "LandTravel":
                    if(((LandTravel)tempTravel).ableToRoll())
                        ((LandTravel)tempTravel).roll();
                    break;

            }
        }
    }
}

