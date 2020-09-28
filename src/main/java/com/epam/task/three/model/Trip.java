package com.epam.task.three.model;

import java.util.List;

public class Trip {
    private List<Route> routes;

    public Trip(List<Route> routes) {
        this.routes = routes;
    }

    public void add(Route route) {
        routes.add(route);
    }

    public void add(List<Route> routes) {
        routes.addAll(routes);
    }

    public List<Route> getRoutes() {
        return routes;
    }

    // TODO: 28.09.2020  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;

        return routes != null ? routes.equals(trip.routes) : trip.routes == null;
    }

    // TODO: 28.09.2020  
    @Override
    public int hashCode() {
        return routes != null ? routes.hashCode() : 0;
    }
}
