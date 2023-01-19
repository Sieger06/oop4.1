package transport;

public class Truck extends Transport implements Competitor {
    public Truck() {
        super("", "", 0);
    }
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("The truck is starting to move.");
    }
    @Override
    public void stopMoving() {
        System.out.println("The truck is stopping.");
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
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume();
    }
}