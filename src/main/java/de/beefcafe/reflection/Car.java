package de.beefcafe.reflection;

import com.fasterxml.jackson.annotation.JsonProperty;

// POJO (Plain Old Java Object / Entity)
public class Car {

    private String brand;
    private String model;
    private int price;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
