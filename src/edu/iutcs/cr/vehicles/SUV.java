package edu.iutcs.cr.vehicles;

import java.io.Serializable;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class SUV extends Vehicle implements Serializable {

    private boolean isOffRoad;

    // Constructor
    public SUV() {
        super();
    }

    public SUV(String registrationNumber, String make, String model, String year, double price, boolean isOffRoad) {
        super(registrationNumber, make, model, year, price);
        this.isOffRoad = isOffRoad;
    }

    // Getters and setters
    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad() {
        // interactive creation via VehicleFactory
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() + ", " +
                "isOffRoad=" + isOffRoad() +
                "}";
    }
}
