package com.unicode.model;

public class WashingMachine extends HomeAppliance {
    private String load;

    public WashingMachine() {
    }

    public WashingMachine(double basePrice, int weight) {
        super(basePrice, weight);
    }

    public WashingMachine(double basePrice, String color, char energyConsumption, int weight, String load) {
        super(basePrice, color, energyConsumption, weight);
        this.load = load;
    }
    private void increasePrice(){
        if (super.getWeight() > 30) increaseAdditionalPrice(50);
        else increaseAdditionalPrice(0);
    }

    @Override
    public void finalPrice(){
        super.finalPrice();
    }

}
