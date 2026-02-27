package edu.iutcs.cr.vehicles;

import java.io.Serializable;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Sedan extends Vehicle implements Serializable {

    private boolean hasSunroof;

    // Constructor
    public Sedan() {
        super();
    }

    public Sedan(String registrationNumber, String make, String model, String year, double price, boolean hasSunroof) {
        super(registrationNumber, make, model, year, price);
        this.hasSunroof = hasSunroof;
    }

    // Getters and setters
    public boolean hasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof() {
        // interactive creation via VehicleFactory
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() + ", " +
                "hasSunroof=" + hasSunroof() +
                "}";
    }
}

