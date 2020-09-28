package com.epam.task.three;

import com.epam.task.three.data.DataAcquirer;
import com.epam.task.three.data.DataAcquirerFactory;
import com.epam.task.three.data.FileDataAcquirer;
import com.epam.task.three.data.Stub;
import com.epam.task.three.exception.ParseException;
import com.epam.task.three.model.Trip;
import com.epam.task.three.parser.TripParser;
import com.epam.task.three.service.TripService;
import com.epam.task.three.view.OutputType;
import com.epam.task.three.view.ResultPrinter;
import com.epam.task.three.view.ResultPrinterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        //input
        Stub stub = new Stub();
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer = dataAcquirerFactory.dataAcquirerCreator("File");
        List<String> data = dataAcquirer.getData();
        TripParser tripParser = new TripParser();
        //Trip trip = stub.getTrip();
        Trip trip = tripParser.parseToTrip(data);




        //calculate
        TripService tripService = new TripService();
        double cost = tripService.getCost(trip);

        //output
        ResultPrinterFactory factory = new ResultPrinterFactory();
        ResultPrinter printer = factory.creatorPrinter(OutputType.FILE);
        printer.print(cost);
    }
}
