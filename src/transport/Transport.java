package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if(engineVolume <= 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public double getEngineVolume(){
        return engineVolume;
    }
    public double setEngineVolume(){
        return engineVolume;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void getMaximumSpeed();
}