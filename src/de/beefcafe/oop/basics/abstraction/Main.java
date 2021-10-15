package de.beefcafe.oop.basics.abstraction;

public class Main {

    public static void main(String[] args) {
        CarReader carReader = new CarReaderCsv();
        DataImporter importer = new DataImporter(carReader);
        importer.doImport();
    }
}
