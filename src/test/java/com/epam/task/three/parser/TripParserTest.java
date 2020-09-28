package com.epam.task.three.parser;

import com.epam.task.three.exception.ParseException;
import com.epam.task.three.model.Route;
import com.epam.task.three.model.TransportType;
import com.epam.task.three.model.Trip;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TripParserTest {

    @Test
    public void testParseToTripWhenDataCorrect() throws ParseException {
        //given
        List<String> input = Arrays.asList(
                "12.6 Subway",
                "6.9 Bus",
                "6.8 Trolleybus",
                "19.8 Tramway"
        );
        List<Route> routeList = Arrays.asList(
                new Route(12.6, TransportType.SUBWAY),
                new Route(6.9, TransportType.BUS),
                new Route(6.8, TransportType.TROLLEYBUS),
                new Route(19.8, TransportType.TRAMWAY)
        );
        Trip actualTrip = new Trip(routeList);
        TripParser parser = new TripParser();

        //when
        Trip resultTrip = parser.parseToTrip(input);

        //then
        Assert.assertEquals(actualTrip, resultTrip);
    }

    @Test(expected = ParseException.class)
    public void testParseToTripWhenDefectDataTrowException() throws ParseException {
        //given
        List<String> input = Arrays.asList(
                "12.6 Subway",
                "6.9 ",
                "6.8 Trolleybus",
                "19.8 Tramway"
        );
        TripParser parser = new TripParser();

        //when
        Trip resultTrip = parser.parseToTrip(input);
    }

    @Test(expected = NumberFormatException.class)
    public void testParseToTripWhenDefectDoubleDataTrowException() throws ParseException {
        //given
        List<String> input = Arrays.asList(
                "12.6 Subway",
                "6.9 Bus",
                "6.8g Trolleybus",
                "19.8 Tramway"
        );
        TripParser parser = new TripParser();

        //when
        Trip resultTrip = parser.parseToTrip(input);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testParseToTripWhenDefectTransportTypeDataTrowException() throws ParseException {
        //given
        List<String> input = Arrays.asList(
                "12.6 Subway",
                "6.9 Cab",
                "6.8 Trolleybus",
                "19.8 Tramway"
        );
        TripParser parser = new TripParser();

        //when
        Trip resultTrip = parser.parseToTrip(input);
    }
}