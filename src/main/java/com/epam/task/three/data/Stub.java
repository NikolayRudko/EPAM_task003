package com.epam.task.three.data;

import com.epam.task.three.model.Route;
import com.epam.task.three.model.TransportType;
import com.epam.task.three.model.Trip;

import java.util.Arrays;
import java.util.List;

public class Stub {
    public Trip getTrip() {

        List<Route> routeList = Arrays.asList(
                new Route(20.4, TransportType.SUBWAY),
                new Route(8.3, TransportType.BUS),
                new Route(11.0, TransportType.TRAMWAY),
                new Route(6.7, TransportType.TROLLEYBUS),
                new Route(11.3, TransportType.SUBWAY),
                new Route(17.6, TransportType.SUBWAY),
                new Route(1.4, TransportType.BUS),
                new Route(2.4, TransportType.TROLLEYBUS)
        );

        Trip trip = new Trip(routeList);

        return trip;
    }
}
