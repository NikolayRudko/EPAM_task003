package com.epam.task.three.view;

public class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void print(double cost) {
        System.out.printf("Cost of trip %.2f%n", cost);
    }
}
