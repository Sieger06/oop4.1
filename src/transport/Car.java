package transport;

public class Car extends Transport implements Competitor {
    public Object pitStop;
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }
    public BodyType getBodyType() {
        return bodyType;
    }

    public void startMoving() {
        System.out.println("The car is starting move.");
    }


    public void stopMoving() {
        System.out.println("The car stopping.");
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

    @Override
    public void printType() {
        System.out.println("Body type: " + getBodyType());
    }

    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume();
    }
}