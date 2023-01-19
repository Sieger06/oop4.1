package Driver;

import transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport> {
    private String fullName;
    private String driversLicence;
    private int drivingExperience;
    private T car;

    public Driver (String fullName, String driversLicence, int drivingExperience, T car){
        this.car = car;
        if(fullName == null || fullName.isEmpty()){
            this.fullName = "Ivanov Ivan Ivanovich";
        }else {
            this.fullName = fullName;
        }
        this.driversLicence = driversLicence;
        if(drivingExperience <= 0){
            this.drivingExperience = 1;
        }else{
            this.drivingExperience = drivingExperience;
        }
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";
        } else {
            this.fullName = fullName;
        }
    }

    public String isDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }

    public void startMoving() {
        System.out.printf("Водитель %s начал двигаться", this.fullName);
        this.car.startMoving();
    }

    public void stopMoving() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.stopMoving();
    }

    public void refuelTheVehicle() {
        System.out.printf("Driver %s refuel the vehicle  %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }
    @Override
    public String toString() {
        return String.format(
                "The driver %s is driving the vehicle %s %s and will participate in the race.",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

}