package ro.siit;

// Dacia brand
abstract class Dacia extends Car {
    public Dacia(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        fuelTankSize = 50; // liters
        fuelType = FuelType.PETROL;
        gears = 5;
        consumptionPer100Km = 6.0f; // default consumption
        tireSize = 15; // inches
    }

    @Override
    public float getAverageFuelConsumption() {
        // Implement method to get average fuel consumption
        return consumptionPer100Km;
    }

    @Override
    public void shiftGear(int gear) {
        // Implement method to shift gear
        // Validate the input gear to ensure it's within the valid range
        if (gear >= 1 && gear <= gears) {
            this.currentGear = gear; // Update the current gear if valid
        } else {
            System.out.println("Invalid gear selected. Please select a gear between 1 and " + gears + ".");
        }
    }
}
// Logan model of Dacia
/* class Logan extends Dacia {
    public Logan(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 5.5f; // Override consumption for Logan
    }
} */
class Logan extends Dacia {
    public Logan(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 5.5f; // Override consumption for Logan
    }

    @Override
    public float getAverageFuelConsumption() {
        return consumptionPer100Km; // or any specific logic for Logan
    }

    @Override
    public float getCurrentConsumption() {
        return getAverageFuelConsumption(); // Ensures that the current consumption is the average, unless adjusted by other factors like speed.
    }
}

