package de.beefcafe.oop.factorymethod;

import de.beefcafe.oop.factorymethod.reader.CarReader;
import de.beefcafe.oop.factorymethod.reader.CarReaderJson;

public class DataImporterJson extends DataImporter{

    @Override
    protected CarReader createCarReader() {
        return new CarReaderJson();
    }

}
