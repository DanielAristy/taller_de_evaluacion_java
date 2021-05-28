package com.unicode.model;

public class WashingMachine extends HomeAppliance {
    private String load;

    public WashingMachine() {
    }

    public WashingMachine(double basePrice, int weight) {
        super(basePrice, weight);
    }

    public WashingMachine(double basePrice, String color, String energyConsumption, int weight, String load) {
        super(basePrice, color, energyConsumption, weight);
        this.load = load;
    }

    @Override
    public void finalPrice(){
        super.finalPrice();
    }

}
