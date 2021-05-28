package com.unicode.model;

public class HomeAppliance {
    private static final double BASE_PRICE = 100;
    private static final String COLOR = "blanco";
    private static final char ENERGY_CONSUMPTION = 'F';
    private static final int WEIGHT = 5;
    private double basePrice = BASE_PRICE;
    private String color = COLOR;
    private char energyConsumption = ENERGY_CONSUMPTION;
    private int weight = WEIGHT;
    private static final String colores[] = {"blanco","negro","rojo","azul","gris"};
    private static final String letters = "A,B,B,C,D,E,F";

    public HomeAppliance() {
    }

    public HomeAppliance(double basePrice, int weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    public HomeAppliance(double basePrice, String color, char energyConsumption, int weight) {
        this.basePrice = basePrice;
        this.color = checkColor(color);
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    private void increasePricePerWeight(){
        if (this.weight >= 0 && this.weight <= 19){
            increaseAdditionalPrice(10);
        }else if (this.weight > 20 && this.weight <= 49){
            increaseAdditionalPrice(50);
        }else if (this.weight >= 50 && this.weight <= 79){
            increaseAdditionalPrice(80);
        }else increaseAdditionalPrice(100);
    }

    private void checkEnergyConsumption(char letter){
        char verificate = Character.toUpperCase(letter);
        if (checkLetter(verificate).equals(String.valueOf(verificate))){
            getConsumption(letter);
        }else {
            this.energyConsumption = ENERGY_CONSUMPTION;
            increaseAdditionalPrice(100);
        }

    }

    private void getConsumption(char letter) {
        switch (Character.toUpperCase(letter)){
            case 'A':
                increaseAdditionalPrice(100);
                break;
            case 'B':
                increaseAdditionalPrice(80);
                break;
            case 'C':
                increaseAdditionalPrice(60);
                break;
            case 'D':
                increaseAdditionalPrice(50);
                break;
            case 'E':
                increaseAdditionalPrice(30);
                break;
            case 'F':
                increaseAdditionalPrice(10);
                break;
        }
    }

    private String checkLetter(char letter){
        return letters.valueOf(letter);
    }
    private String checkColor(String color){
        String colorValue = "";
        boolean verificate = false;
        for (int i = 0; i < colores.length; i++) {
            if (color.toLowerCase() == colores[i].toString()){
                colorValue  = colores[i];
                verificate = true;
                break;
            }
        }
        if (!verificate){
            colorValue = COLOR;
        }

        return colorValue;
    }

    public void finalPrice(){
        checkEnergyConsumption(this.energyConsumption);
        increasePricePerWeight();
    }

    public void increaseAdditionalPrice(double additional){
        this.basePrice += additional;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public static String[] getColores() {
        return colores;
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "basePrice=" + basePrice +
                ", color='" + color + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", weight=" + weight +
                '}';
    }
}
