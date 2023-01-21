package Drivers;

import transport.Bus;

public class DriverD extends Driver.Driver<Bus> {
    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }
}