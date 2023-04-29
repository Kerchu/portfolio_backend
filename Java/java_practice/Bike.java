package java_practice;

public class Bike extends Vehicle {
    int cilinder;

//Construct
    public Bike(){}

    public Bike(int registerNum, int wheels, String model, String brand, int cilinder) {
        super(registerNum, wheels, model, brand);
        this.cilinder = cilinder;
    }

// Methods
    public int getCilinder() {
        return cilinder;
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }
}
