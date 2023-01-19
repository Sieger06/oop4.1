import transport.Car;
import transport.Bus;
import transport.Truck;
import java.time.LocalDate;
import Driver.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
public class Main {
    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();
    public static void main(String[] args) {

        Car ladaGranta =new Car("Lada", "Granta", 1.7);
        Car audiA8 = new Car("Audi", "A8 50L TDI quattro", 3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0);
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        bmwZ8.startMoving();
        bmwZ8.stopMoving();
        bmwZ8.pitStop();
        bmwZ8.getBestLapTime();
        bmwZ8.getMaximumSpeed();
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println();

        Bus man = new Bus("Man", "Lion's Coach", 3);
        Bus mercerdes = new Bus("Mercedes-Benz", "Travego RHD 15 RHD", 3);
        Bus scania = new Bus("Scania", "Touring 6X2", 3);
        Bus KingLong = new Bus("King Long", "XMQ6129Y", 3);

        System.out.println(man);
        System.out.println(mercerdes);
        mercerdes.startMoving();
        mercerdes.stopMoving();
        mercerdes.pitStop();
        mercerdes.getBestLapTime();
        mercerdes.getMaximumSpeed();
        System.out.println(scania);
        System.out.println(KingLong);
        System.out.println();

        Truck volvo = new Truck("Volvo", "Wild Viking", 12.4);
        Truck scaniaTruck = new Truck("Scania", "Red Pearl R999", 15.6);
        Truck thor = new Truck("Thor", "24", 27.9);
        Truck Freightliner = new Truck("Freightliner", "Cascadia Banks Super-Turbo", 14);

        System.out.println(volvo);
        System.out.println(scaniaTruck);
        System.out.println(thor);
        thor.startMoving();
        thor.stopMoving();
        thor.pitStop();
        thor.getBestLapTime();
        thor.getMaximumSpeed();
        System.out.println(Freightliner);
        System.out.println();

/*        DriverD<Bus> ilja = new DriverD<Bus>("Aleksei Andreevich Semenov", true, 12);
        ilja.drive(mercerdes);
        DriverB<Car> andrej = new DriverB<Car>("Andrej Alekseevich Mihailov", true, 11);
        andrej.drive(bmwZ8);
        DriverC<Truck> sergej = new DriverC<Truck>("Sergej Aleksandrovich Skvortcov", true, 10);
        sergej.drive(thor);*/

        DriverB driverB = new DriverB("Aleksey Semenov", 10, bmwZ8);
        System.out.println(driverB);
        DriverC driverC = new DriverC("Andrey Mihailov", 10, volvo);
        System.out.println(driverC);
        DriverD driverD = new DriverD("Sergej Skvortcov", 10, mercerdes);
        System.out.println(driverD);
    }
}
