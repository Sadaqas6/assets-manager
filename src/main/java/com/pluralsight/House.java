package com.pluralsight;

public class House extends Asset {

    protected String address;
    protected int condition, squareFoot, lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

@Override
    public double getValue(){
        double valuePerSqFt;
        switch(condition){
            case 1: valuePerSqFt = 180; break; // excellent
            case 2: valuePerSqFt = 130; break; // good
            case 3: valuePerSqFt = 90; break; // fair
            case 4: valuePerSqFt = 80; break; // poor
            default: valuePerSqFt = 0.00;
        }
        return (squareFoot * valuePerSqFt) + (lotSize * 0.25);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}