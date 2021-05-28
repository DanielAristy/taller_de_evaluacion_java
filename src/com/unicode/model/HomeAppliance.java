package com.unicode.model;

public class HomeAppliance {
    private static final double BASE_PRICE = 100;
    private static final String COLOR = "blanco";
    private static final String ENERGY_CONSUMPTION = "F";
    private static final int WEIGHT = 5;
    private double basePrice = BASE_PRICE;
    private String color = COLOR;
    private String energyConsumption = ENERGY_CONSUMPTION;
    private int weight = WEIGHT;
    private static final String colores[] = {"blanco","negro","rojo","azul","gris"};

    public HomeAppliance() {
    }

    public HomeAppliance(double basePrice, int weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    public HomeAppliance(double basePrice, String color, String energyConsumption, int weight) {
        this.basePrice = basePrice;
        this.color = color;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    private void checkEnergyConsumption(char letter){

    }
    private void checkColor(String color){

    }

    private void finalPrice(){

    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public static String[] getColores() {
        return colores;
    }
}
