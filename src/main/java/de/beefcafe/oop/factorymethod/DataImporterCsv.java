package de.beefcafe.oop.factorymethod;

import de.beefcafe.oop.factorymethod.reader.CarReader;
import de.beefcafe.oop.factorymethod.reader.CarReaderCsv;

public class DataImporterCsv extends DataImporter{

    private static CarReaderCsv instance = new CarReaderCsv();

    @Override
    protected CarReader createCarReader() {
        System.out.println("instance: " + instance);
        return instance;
    }

}
