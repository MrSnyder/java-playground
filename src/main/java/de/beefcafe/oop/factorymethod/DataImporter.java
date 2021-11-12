package de.beefcafe.oop.factorymethod;

import de.beefcafe.oop.factorymethod.config.Configuration;
import de.beefcafe.oop.factorymethod.reader.CarReader;

import java.util.List;

public abstract class DataImporter {

    public void doImport() {
        CarReader reader = createCarReader();
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

    // *** FACTORY METHOD ****
    protected abstract CarReader createCarReader();

}
