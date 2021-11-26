package de.beefcafe.oop.basics.iterator;

import de.beefcafe.oop.basics.iterator.config.Configuration;
import de.beefcafe.oop.basics.iterator.reader.CarReader;

import java.util.Iterator;
import java.util.List;

public class DataImporter {

    private final CarReader reader;

    public DataImporter(CarReader reader) {
        this.reader = reader;
    }

    public void doImport() {

        Iterator<Car> carIter = reader.getCarIterator();
        long totalPrice = 0;
        // import to DB
        Configuration config = Configuration.getInstance();
        System.out.println("A: " + config);
        // gibt es ein nächstes Element?
        int i = 0;
        while (carIter.hasNext()) {
            // JA -> hole das nächste
            Car car = carIter.next();
/*            if (config.getLanguage().equals("DE")) {
                System.out.println("Importiere Auto: " + car);
            } else {
                System.out.println("Importing car: " + car);
            }*/
            totalPrice += car.getPrice();
            if (i % 10000 == 0) {
                System.out.println(i);
            }
            i++;
        }
        // NEIN -> wir sind raus
        if (config.getLanguage().equals("DE")) {
            System.out.println("Preis aller importierten Autos: "  + totalPrice);
        } else {
            System.out.println("Total price of imported cars: "  + totalPrice);
        }

    }

}
