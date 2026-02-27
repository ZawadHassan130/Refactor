package edu.iutcs.cr.vehicles;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Hatchback extends Vehicle {

    private boolean isCompact;

    public Hatchback() {
        super();
    }

    public Hatchback(String registrationNumber, String make, String model, String year, double price, boolean isCompact) {
        super(registrationNumber, make, model, year, price);
        this.isCompact = isCompact;
    }

    public boolean isCompact() {
        return isCompact;
    }

    public void setCompact() {
        // interactive creation via VehicleFactory
    }

    @Override
    public String toString() {
        return "Hatchback{" + super.toString() + ", " +
                "isCompact=" + isCompact() +
                "}";
    }
}
