package ro.siit;

// Volkswagen brand
abstract class Volkswagen extends Car {
    public Volkswagen(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        fuelTankSize = 60; // liters
        fuelType = FuelType.DIESEL;
        gears = 6;
        consumptionPer100Km = 5.0f; // default consumption
        tireSize = 16; // inches
        currentGear = 0; // Initialize current gear
    }

    @Override
    public float getAverageFuelConsumption() {
        // Implement method to get average fuel consumption
        return consumptionPer100Km;
    }

    @Override
    public void shiftGear(int gear) {
        // Implement method to shift gear
        if (gear > 0 && gear <= gears) {
            currentGear = gear;
        } else {
            System.out.println("Invalid gear selection.");
        }
    }
}

// VWGolf model of Volkswagen
class VWGolf extends Volkswagen {
    public VWGolf(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 4.5f; // Override consumption for VWGolf
    }
}

// VWPassat model of Volkswagen
class VWPassat extends Volkswagen {
    public VWPassat(int availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
        consumptionPer100Km = 4.8f; // Override consumption for VWPassat
    }
}
