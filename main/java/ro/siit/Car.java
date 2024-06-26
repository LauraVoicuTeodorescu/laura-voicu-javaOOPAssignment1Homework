package ro.siit;

// Abstract class for Car
abstract class Car extends Vehicle {
    protected int fuelTankSize;
    protected FuelType fuelType;
    protected int gears;
    protected float consumptionPer100Km;
    protected int tireSize;
    protected int currentGear;

    public Car(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

    // Method to calculate current consumption based on gear and tire size
    protected void calculateConsumption(int gear) {
        // TODO Implement consumption calculation based on gear and tire size
        float baseConsumption = consumptionPer100Km;
        // Adjust consumption based on gear
        float gearFactor = (1.0f - 0.05f * (gear - 1));
        // Adjust consumption based on tire size (assuming a base size of 15 inches)
        float tireFactor = 1.0f + (tireSize - 15) / 5 * 0.01f;
        consumptionPer100Km = baseConsumption * gearFactor * tireFactor;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
