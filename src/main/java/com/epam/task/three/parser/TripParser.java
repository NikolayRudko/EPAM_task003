package com.epam.task.three.parser;

import com.epam.task.three.exception.ParseException;
import com.epam.task.three.model.Route;
import com.epam.task.three.model.TransportType;
import com.epam.task.three.model.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripParser {

    public Trip parseToTrip(List<String> data) throws ParseException {

        List<Route> routeList = new ArrayList<>();

        for (String str : data) {
            routeList.add(parseToRoute(str));
        }

        return new Trip(routeList);
    }

    private Route parseToRoute(String str) throws ParseException {
        String[] strRoute = str.split("\\s+");

        TransportType type;
        double cost;

        if (strRoute.length != 2) {
            throw new ParseException("Defective data!");
        }

        cost = Double.parseDouble(strRoute[0]);

        switch (strRoute[1]) {
            case "Subway":
                type = TransportType.SUBWAY;
                break;
            case "Bus":
                type = TransportType.BUS;
                break;
            case "Trolleybus":
                type = TransportType.TROLLEYBUS;
                break;
            case "Tramway":
                type = TransportType.TRAMWAY;
                break;
            default:
                throw new IllegalArgumentException();
        }

        return new Route(cost, type);
    }
}
