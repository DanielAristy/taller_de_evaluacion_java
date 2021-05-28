package com.unicode.model;

public class Tv extends HomeAppliance{

    private int resolution = 20;
    private boolean tunerTDT = false;

    public Tv() {
    }

    public Tv(double basePrice, int weight) {
        super(basePrice, weight);
    }

    public Tv(double basePrice, String color, String energyConsumption, int weight, int resolution, boolean tunerTDT) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }
}
