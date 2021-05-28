package com.unicode.model;

public class WashingMachine extends HomeAppliance {
    private int load;

    public WashingMachine() {
    }

    public WashingMachine(double basePrice, int weight) {
        super(basePrice, weight);
    }

    public WashingMachine(double basePrice, String color, char energyConsumption, int weight, int load) {
        super(basePrice, color, energyConsumption, weight);
        this.load = load;
    }
    private void increasePrice(){
        if (this.load > 30) increaseAdditionalPrice(50);
        else increaseAdditionalPrice(0);
    }

    @Override
    public void finalPrice(){
        super.finalPrice();
        increasePrice();
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load=" + load +
                '}';
    }
}
