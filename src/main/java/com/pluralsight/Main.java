package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My Home", "11-09-2020", 250000, "234 Barney Lane, Love, GA 34563", 3, 2300, 2));
        assets.add(new House("Lake House", "10-12-2024", 1000000, "123 LakeFront Ct, Lake City, GA 30234", 1, 6000, 10  ));
        assets.add(new Vehicle("My car", "12-23-2025", 75000, "Mercedes GLE SUV",2025, 1200));
        assets.add(new Vehicle("Stacey's Car", "05-24-2023", 45000, "Nissan Rogue SUV", 2015,105000));

        String message = "";
        for (Asset a : assets) {
            if (a instanceof House) {
                House house = (House) a;
                message = "House at " + house.getAddress();
            } else if (a instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) a;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }
        }

    }
}
