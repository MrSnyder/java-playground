package de.beefcafe.oop.basics.abstraction;

import java.util.List;

public class DataImporter {

    private final CarReader reader;

    public DataImporter(CarReader reader) {
        this.reader = reader;
    }

    public void doImport() {
        List<Car> cars = reader.readCars();
        // import to DB
        for (Car car : cars) {
            System.out.println("Importing car: " + car);
        }
    }

}
