package de.beefcafe.oop.basics.abstraction;

import de.beefcafe.oop.basics.abstraction.reader.CarReader;
import de.beefcafe.oop.basics.abstraction.reader.CarReaderJson;

public class Main {

    public static void main(String[] args) {
        CarReader carReader = new CarReaderJson();
        DataImporter importer = new DataImporter(carReader);
        new Thread(new DataImporterRunnable(importer)).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new DataImporterRunnable(importer)).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new DataImporterRunnable(importer)).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new DataImporterRunnable(importer)).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new DataImporterRunnable(importer)).start();
    }

    private static class DataImporterRunnable implements Runnable {

        private final DataImporter importer;

        DataImporterRunnable(DataImporter importer) {
            this.importer = importer;
        }

        @Override
        public void run() {
            importer.doImport();
        }
    }
}
