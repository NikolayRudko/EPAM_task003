package com.epam.task.three.view;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileResultPrinter implements ResultPrinter {

    @Override
    public void print(double cost) {
        String FILE = "Output.txt";
        File file = new File(FILE);
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%.2f", cost);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
