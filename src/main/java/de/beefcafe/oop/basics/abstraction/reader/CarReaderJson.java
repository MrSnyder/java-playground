package de.beefcafe.oop.basics.abstraction.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.beefcafe.oop.basics.abstraction.Car;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class CarReaderJson implements CarReader {

    @Override
    public List<Car> readCars() {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = CarReaderCsv.class.getResourceAsStream("car.json");
        try {
            return Collections.singletonList(mapper.readValue(is, Car.class));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
