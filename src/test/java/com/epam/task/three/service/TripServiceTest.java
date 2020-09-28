package com.epam.task.three.service;

import com.epam.task.three.model.Route;
import com.epam.task.three.model.TransportType;
import com.epam.task.three.model.Trip;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TripServiceTest {

    private static final double DELTA = 0.001;

    @Test
    public void testGetCostWhenIsDataCorrect() {
        //given
        Trip trip = new Trip(Arrays.asList(
                new Route(20.4, TransportType.SUBWAY),
                new Route(8.3, TransportType.BUS),
                new Route(11.0, TransportType.TRAMWAY),
                new Route(6.7, TransportType.TROLLEYBUS),
                new Route(11.3, TransportType.SUBWAY),
                new Route(17.6, TransportType.SUBWAY),
                new Route(1.4, TransportType.BUS),
                new Route(2.4, TransportType.TROLLEYBUS)
        ));
        TripService service = new TripService();
        double actual = 79.1;

        //when
        double cost = service.getCost(trip);

        //then
        Assert.assertEquals(cost, actual, DELTA);
    }
}