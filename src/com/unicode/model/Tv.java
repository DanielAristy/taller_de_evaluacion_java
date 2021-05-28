package com.unicode.model;

public class Tv extends HomeAppliance{

    private int resolution = 20;
    private boolean tunerTDT = false;

    public Tv() {
    }

    public Tv(double basePrice, int weight) {
        super(basePrice, weight);
    }

    public Tv(double basePrice, String color, char energyConsumption, int weight, int resolution, boolean tunerTDT) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }
    private double increasePricePerResolution(){
        return getBasePrice() * 0.3;
    }

    private void increasePrice(){
        if (getResolution() > 40){
            increaseAdditionalPrice(increasePricePerResolution());
        }
    }
    @Override
    public void finalPrice() {
        super.finalPrice();
        increasePrice();
        increasePricePerTDT();
    }

    private void increasePricePerTDT() {
        if (this.tunerTDT){
            increaseAdditionalPrice(50);
        }
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }
}
