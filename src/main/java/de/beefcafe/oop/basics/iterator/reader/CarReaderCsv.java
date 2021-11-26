package de.beefcafe.oop.basics.iterator.reader;

import de.beefcafe.oop.basics.iterator.Car;
import de.beefcafe.oop.basics.iterator.CarCsvCreator;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarReaderCsv implements CarReader {

    @Override
    public Iterator<Car> getCarIterator() {
        try {
            InputStream is = new FileInputStream("/tmp/cars.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            reader.readLine();
            return new CarCsvIterator(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private class CarCsvIterator implements Iterator<Car> {

        private final BufferedReader csvReader;

        private String nextLine;

        private CarCsvIterator(BufferedReader csvReader ) {
            this.csvReader = csvReader;
        }

        @Override
        public boolean hasNext() {
            try {
                nextLine = csvReader.readLine();
            } catch (IOException e) {
                return false;
            }
            if (nextLine == null) {
                return false;
            }
            return true;
        }

        @Override
        public Car next() {
            if (nextLine == null) {
                throw new NoSuchElementException();
            }
            return readCar(nextLine);
        }
    }

/*    @Override
    public List<Car> readCars() {
        List<Car> cars = new ArrayList<>();
//        InputStream is = CarReaderCsv.class.getResourceAsStream("../../abstraction/reader/cars.csv");
        try {
            InputStream is = new FileInputStream("/tmp/cars.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            reader.readLine();
            // skip first line
            line = reader.readLine();
            while (line != null) {
                Car car = readCar(line);
                cars.add(car);
                line = reader.readLine();
                if (cars.size() % 1000 == 0) {
                    System.out.println(cars.size());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return cars;
    }*/

    public Car readCar(String line) {
        // VW,Golf GTI V,50000,red
        String[] fields = line.split(",");
        return new Car(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3]);
    }

}

