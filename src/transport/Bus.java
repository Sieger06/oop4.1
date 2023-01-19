package transport;
public class Bus extends Transport implements Competitor {
    public Bus() {
        super("", "", 0);
    }
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("The bus is starting to move.");
    }
    @Override
    public void stopMoving() {
        System.out.println("The bus is stopping.");
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