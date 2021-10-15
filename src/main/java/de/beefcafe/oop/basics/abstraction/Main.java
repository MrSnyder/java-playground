package de.beefcafe.oop.basics.abstraction;

import de.beefcafe.oop.basics.abstraction.reader.CarReader;
import de.beefcafe.oop.basics.abstraction.reader.CarReaderJson;

public class Main {

    public static void main(String[] args) {
        CarReader carReader = new CarReaderJson();
        DataImporter importer = new DataImporter(carReader);
        importer.doImport();
    }
}
