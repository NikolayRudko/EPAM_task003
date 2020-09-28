package com.epam.task.three.service;

import com.epam.task.three.model.Route;
import com.epam.task.three.model.Trip;

public class TripService {
    public double getCost(Trip trip) {
        double cost = 0;

        for (Route route : trip.getRoutes()) {
            cost += route.getCost();
        }

        return cost;
    }
}
