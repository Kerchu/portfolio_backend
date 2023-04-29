package java_practice;

import java.util.Vector;

public class ExampleOOP {
    public static void main(String[] args) {
        Vehicle vehi = new Vehicle(345, 4, "12", "Renault");
        Car car1 = new Car ();
        Car car2 = new Car(37, 4, "Zhiguli", "Lada", 1, "KGB1954", 2, "Red", true);
        Bike bike1 = new Bike(125, 2, "V-Max", "Yamaha", 1679);
        Truck truck1 = new Truck(125, 6, "Mercedes", "Kurzhauber", 1, false);
        Vehicle vector[] = new Vehicle[4];
        vector[0] = vehi;
        vector[1] = car2;
        vector[2] = bike1;
        vector[3] = truck1;

        for (int i=0; i<4; i++){
            System.out.println("Register Nº " + i + ": " + vector[i].getBrand());
        }

        System.out.println("-----------------------------");
        car2.turnOn();
        car2.acelerate(60);
        car2.stop(30);
        car2.turnOff();
        System.out.println("-----------------------------");
        System.out.println("ID value is: "+ car2.getId());
        car2.setId(35000);
        System.out.println("New ID value is: "+ car2.getId());
        System.out.println("-----------------------------");
        System.out.println("Car1's ID is: " + car1.getId());
        System.out.println("Car1's color is " + car1.getColor());
        car1.setId(1500);
        car1.setPatent("ARG2022");
        car1.setDoorNum(3);
        car1.setManualGearbox(false);
        System.out.println("-----------------------------");
        System.out.println("Car1's new ID is: " + car1.getId());
        System.out.println("Car1's new color is: " + car1.getColor());
        System.out.println("-----------------------------");
        System.out.println(car2.toString());
    }
}
