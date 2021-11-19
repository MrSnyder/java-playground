package de.beefcafe.reflection;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.beefcafe.oop.basics.abstraction.reader.CarReaderCsv;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    private static void analyzeClass (Class clzz) {
        // analyze car class
        System.out.println("Analyzing class: " + clzz);
        Constructor[] constructors = clzz.getDeclaredConstructors();
        System.out.println("Constructors: " + constructors.length);
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getParameterCount());
        }
        Method[] methods = clzz.getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            if (method.getName().startsWith("set")) {
                System.out.println("Found setter: "  + method);
            }
        }
    }

    public static void main(String[] args) throws IOException {

//        InputStream is = Main.class.getResourceAsStream("../oop/basics/abstraction/reader/car.json");
//        ObjectMapper mapper = new ObjectMapper();
//        Car car = mapper.readValue(is, Car.class);
        analyzeClass(Car.class);

    }


}
