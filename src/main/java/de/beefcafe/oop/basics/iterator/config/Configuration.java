package de.beefcafe.oop.basics.iterator.config;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Configuration {

    private static Configuration instance;

    private String language;

    private String textColor;

    private ObjectMapper objectMapper;

    private Configuration(String language, String textColor, ObjectMapper objectMapper) {
        this.language = language;
        this.textColor = textColor;
        this.objectMapper = objectMapper;
    }

    public static Configuration getInstance() {
        if (instance == null) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            instance = new Configuration("DE", "black", new ObjectMapper());
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public String getTextColor() {
        return textColor;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
