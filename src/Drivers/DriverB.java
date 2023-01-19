package Drivers;

import transport.Car;

public class DriverB extends Driver.Driver<Car> {
    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
    }
}