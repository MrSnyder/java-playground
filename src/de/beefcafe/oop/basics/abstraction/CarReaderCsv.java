package de.beefcafe.oop.basics.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarReaderCsv implements CarReader {

    @Override
    public List<Car> readCars() {
        List<Car> cars = new ArrayList<>();
        InputStream is = CarReaderCsv.class.getResourceAsStream("cars.csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = null;
        try {
            line = reader.readLine();
            // skip first line
            reader.readLine();
            while (line != null) {
                cars.add(readCar(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return cars;
    }

    private Car readCar(String line) {
        String[] fields = line.split(",");
        // VW,Golf GTI V,50000,red
        return new Car(fields[0], fields[1], fields[2], fields[3]);
    }

}

