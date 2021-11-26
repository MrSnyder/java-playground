package de.beefcafe.oop.basics.iterator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CarCsvCreator {

    public static void main(String[] args) throws IOException {

        System.out.println(Integer.MAX_VALUE);

        PrintWriter pw = new PrintWriter("/tmp/cars.csv");
        pw.println("Brand,Model,Price,Color");

        for (int i = 0; i < 1000000000; i++) {
            if ( i % 1000 == 0) {
                System.out.println(i);
            }
            Car car  = new Car("VW", "Golf", (int) (5000.0 + Math.random() * 20000.0), "red");
            pw.println( car.getBrand() + "," + car.getModel() + "," + car.getPrice() + "," + car.getColor());
        }
        pw.close();
    }

}
