package de.beefcafe.oop.basics.abstraction.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.beefcafe.oop.basics.abstraction.Car;
import de.beefcafe.oop.basics.abstraction.config.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CarReaderJson implements CarReader {

    @Override
    public List<Car> readCars() {
        Configuration config = Configuration.getInstance();
        System.out.println("B: " + config);
        ObjectMapper mapper = config.getObjectMapper();
        InputStream is = CarReaderCsv.class.getResourceAsStream("cars.json");
        try {
            return mapper.readValue(is, new TypeReference<List<Car>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
