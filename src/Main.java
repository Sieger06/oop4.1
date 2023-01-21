import transport.*;

import java.time.LocalDate;
import Driver.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

import static transport.LoadCapacity.*;
import transport.TransportService;

public class Main {
    private static final int CURRENT_MONTH = LocalDate.now().getMonthValue();
    public static void main(String[] args) {

/*        Car ladaGranta = new Car("Lada", "Granta", 1.7, BodyType.SEDAN);
        Car audiA8 = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.COUPE);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, BodyType.COUPE);
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4, BodyType.CROSSOVER);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, BodyType.HATCHBACK);*/

        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, BodyType.SEDAN);
        cars[1] = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.COUPE);
        cars[2] = new Car("BMW", "Z8", 3.0, BodyType.COUPE);
        cars[3] = new Car("Kia", "Sportage 4th generation", 2.4, BodyType.CROSSOVER);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Man", "Lion's Coach", 3, BusCapacity.SMALL);
        buses[1] = new Bus("Mercedes-Benz", "Travego RHD 15 RHD", 3, BusCapacity.BIG);
        buses[2] = new Bus("Scania", "Touring 6X2", 3, BusCapacity.MIDDLE);
        buses[3] = new Bus("King Long", "XMQ6129Y", 3, BusCapacity.EXTRA_BIG);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Volvo", "Wild Viking", 12.4, N1);
        trucks[1] = new Truck("Scania", "Red Pearl R999", 15.6, N2);
        trucks[2] = new Truck("Thor", "24", 27.9, N3);
        trucks[3] = new Truck("Freightliner", "Cascadia Banks Super-Turbo", 14, N2);

        TransportService.printTruckWithEnum(trucks);
        trucks[0].printType();
        TransportService.printCarWithEnum(cars);
        cars[0].printType();
        TransportService.printBusWithEnum(buses);
        buses[0].printType();


/*        DriverB driverB = new DriverB("Aleksey Semenov", 10, bmwZ8);
        System.out.println(driverB);
        DriverC driverC = new DriverC("Andrey Mihailov", 10, volvo);
        System.out.println(driverC);
        DriverD driverD = new DriverD("Sergej Skvortcov", 10, mercerdes);
        System.out.println(driverD);*/
    }
}
