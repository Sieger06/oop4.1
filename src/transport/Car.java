package transport;

public class Car extends Transport implements Competitor {
    public Object pitStop;

    public Car() {
        super("", "", 0);
    }
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("The car is starting move.");
    }
    @Override
    public void stopMoving() {
        System.out.println("The car stopping.");
    }
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume();
    }
    @Override
    public void pitStop() {
        System.out.println("Your car should drive to a pit-stop");
    }
    @Override
    public void getBestLapTime() {
        System.out.println("Best car lap time is: ");
    }
    @Override
    public void getMaximumSpeed() {
        System.out.println("Maximum car speed is: ");
    }
}