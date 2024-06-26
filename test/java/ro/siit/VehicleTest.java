package ro.siit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testStart() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        Assertions.assertTrue(vehicle.isRunning());
    }

    @Test
    public void testStop() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        vehicle.stop();
        Assertions.assertFalse(vehicle.isRunning());
    }

    @Test
    public void testDrive() {
        Vehicle vehicle = new Logan(50, "123456");
        vehicle.start();
        vehicle.drive(10);
        //Assertions.assertEquals(10, vehicle.getTotalFuelConsumed());
        float expectedFuelConsumed = (10 / 100.0f) * 5.5f + 0.1f; // includes starting fuel consumption
        Assertions.assertEquals(expectedFuelConsumed, vehicle.getTotalFuelConsumed(), 0.01);
    }

    @Test
    public void testGetAverageFuelConsumption() {
        Vehicle vehicle = new Logan(50, "123456");
        Assertions.assertEquals(5.5f, vehicle.getAverageFuelConsumption());
    }

    @Test
    public void testShiftGear() {
        Car car = new Logan(50, "123456");
        car.start();
        car.shiftGear(2);
        Assertions.assertEquals(2, car.getCurrentGear());
    }
}

