package de.beefcafe.oop.factorymethod;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: Main [csv/json]");
            System.exit(0);
        }
        String mode = args[0];
        for (int i = 0; i < 2; i++) {
            DataImporter importer = null;
            if ("csv".equals(mode)) {
                System.out.println("*** CSV mode");
                importer = new DataImporterCsv();
            } else if ("json".equals(mode)) {
                System.out.println("*** JSON mode");
                importer = new DataImporterJson();
            } else {
                System.out.println("Unknown mode.");
                System.out.println("USAGE: Main [csv/json]");
                System.exit(0);
            }
            importer.doImport();
        }
    }

}
