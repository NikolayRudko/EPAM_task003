package com.epam.task.three.data;

public class DataAcquirerFactory {
    public DataAcquirer dataAcquirerCreator(String type){
        switch (type){
            case "File" :
                return new FileDataAcquirer();
            default:
                throw new IllegalArgumentException();
        }
    }
}
