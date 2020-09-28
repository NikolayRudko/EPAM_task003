package com.epam.task.three.model;

public class Route {
    private double cost;
    private TransportType type ;

    public Route(double cost, TransportType type) {
        this.cost = cost;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    // TODO: 28.09.2020  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Route route = (Route) obj;

        if (Double.compare(route.cost, cost) != 0) {
            return false;
        }
        return type == route.type;
    }

    // TODO: 28.09.2020  
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
