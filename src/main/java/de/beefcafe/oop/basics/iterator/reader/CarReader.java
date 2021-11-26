package de.beefcafe.oop.basics.iterator.reader;

import de.beefcafe.oop.basics.iterator.Car;

import java.util.Iterator;
import java.util.List;

public interface CarReader {

//    List<Car> readCars();

    Iterator<Car> getCarIterator();

}
