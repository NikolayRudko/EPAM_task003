package com.epam.task.three.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDataAcquirer implements DataAcquirer {

    @Override
    public List<String> getData() {

        String pathToFile = "src/main/resources/input.txt";

        List<String> data = new ArrayList<>();

        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                data.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }

        return data;
    }
}
