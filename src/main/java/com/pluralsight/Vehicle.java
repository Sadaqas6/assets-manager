package com.pluralsight;

public class Vehicle extends Asset {

    protected String makeModel;
    protected int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int currentYear = 2026;
        int age = currentYear - year;
        double value;

        if(age <= 3) {
            value = originalCost * Math.pow(1 - 0.03, age);  // 3% reduction
        } else if (age <= 6) {
            value = originalCost * Math.pow(1 - 0.06, age); // 6% reduction
        } else if (age <= 8) {
            value = originalCost * Math.pow(1 - 0.08, age); // 8% reduction
        } else  {
            value = 1000.00;
        }
       boolean isReliableBrand = makeModel.toLowerCase().contains("Honda") || makeModel.toLowerCase().contains("Toyota");

        if(odometer > 100_000 && !isReliableBrand){
            value *= 0.75;
        }
        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
