package ro.siit;

// Abstract class for Vehicle
abstract class Vehicle {
    private String chassisNumber;
    private float availableFuel;
    private float totalFuelConsumed;
    private float currentConsumption;
    private boolean isRunning;

    // Constructor
    public Vehicle(float availableFuel, String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    // Method to start the vehicle
    public void start() {
        //TODO Implement start behavior
        if (!isRunning && availableFuel > 0) {
            isRunning = true;
            // Assume a small amount of fuel is used to start the engine
            totalFuelConsumed += 0.1f;  // Example value
        }

    }

    // Method to stop the vehicle
    public void stop() {
        //TODO Implement stop behavior
        if (isRunning) {
            isRunning = false;
            // Reset current consumption when stopped
            currentConsumption = 0;
        }
    }

    // Method to drive the vehicle for a certain distance
    public void drive(float distance) {
        //TODO Implement drive behavior
    /*    if (isRunning && availableFuel > totalFuelConsumed) {
            float fuelNeeded = (distance / 100) * getCurrentConsumption();
            if ((availableFuel - totalFuelConsumed) >= fuelNeeded) {
                totalFuelConsumed += fuelNeeded;
            } else {
                System.out.println("Not enough fuel to complete the drive.");
                stop();  // Stop the vehicle if not enough fuel
            }
        } else if (!isRunning) {
            System.out.println("Vehicle is not running.");
        } */
            if (!isRunning) {
                System.out.println("Vehicle is not running. Please start the vehicle first.");
                return;
            }
            if (availableFuel <= totalFuelConsumed) {
                System.out.println("Not enough fuel.");
                return;
            }

            float fuelNeeded = (distance / 100) * getCurrentConsumption();
            if ((availableFuel - totalFuelConsumed) >= fuelNeeded) {
                totalFuelConsumed += fuelNeeded;
            } else {
                System.out.println("Not enough fuel to complete the drive. Vehicle will stop.");
                stop(); // Stop the vehicle if not enough fuel
            }
        }

    // Abstract method to get the average fuel consumption per 100 Km
    public abstract float getAverageFuelConsumption();

    // Abstract method to shift gear
    public abstract void shiftGear(int gear);

    // Getters and setters
    public float getAvailableFuel() {
        return availableFuel - totalFuelConsumed;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public float getCurrentConsumption() {
        return currentConsumption;
    }

    public float getTotalFuelConsumed() {
        return totalFuelConsumed;
    }
}
