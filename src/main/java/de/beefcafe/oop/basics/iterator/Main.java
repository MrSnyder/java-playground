package de.beefcafe.oop.basics.iterator;

import de.beefcafe.oop.basics.iterator.reader.CarReader;
import de.beefcafe.oop.basics.iterator.reader.CarReaderCsv;

public class Main {

    public static void main(String[] args) {
        CarReader carReader = new CarReaderCsv();
        DataImporter importer = new DataImporter(carReader);
        importer.doImport();
    }

}
