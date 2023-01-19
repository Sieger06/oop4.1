package Drivers;

import transport.Truck;

public class DriverC extends Driver.Driver<Truck> {

    public DriverC(String fullName,  int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }
}