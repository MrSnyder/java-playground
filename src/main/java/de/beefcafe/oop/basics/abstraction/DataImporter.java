package de.beefcafe.oop.basics.abstraction;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.beefcafe.oop.basics.abstraction.config.Configuration;
import de.beefcafe.oop.basics.abstraction.reader.CarReader;

import java.util.List;

public class DataImporter {

    private final CarReader reader;

    public DataImporter(CarReader reader) {
        this.reader = reader;
    }

    public void doImport() {

        List<Car> cars = reader.readCars();
        int totalPrice = 0;
        // import to DB
        Configuration config = Configuration.getInstance();
        System.out.println("A: " + config);
        for (Car car : cars) {
            if (config.getLanguage().equals("DE")) {
                System.out.println("Importiere Auto: " + car);
            } else {
                System.out.println("Importing car: " + car);
            }
            totalPrice += car.getPrice();

        }
        if (config.getLanguage().equals("DE")) {
            System.out.println("Preis aller importierten Autos: "  + totalPrice);
        } else {
            System.out.println("Total price of imported cars: "  + totalPrice);
        }

    }

}
