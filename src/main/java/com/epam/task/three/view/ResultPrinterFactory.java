package com.epam.task.three.view;

public class ResultPrinterFactory {
    public ResultPrinter creatorPrinter(OutputType outputType) {
        switch (outputType) {
            case CONSOLE:
                return new ConsoleResultPrinter();
            case FILE:
                return new FileResultPrinter();
            default:
                throw new IllegalArgumentException("Incorrect data type.");
        }

    }
}
