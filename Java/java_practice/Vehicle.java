package java_practice;

public class Vehicle {
//Atributes
    int registerNum;
    int wheels;
    String model;
    String brand;

//Construct
    public Vehicle() {}  

    public Vehicle(int registerNum, int wheels, String model, String brand) {
        this.registerNum = registerNum;
        this.wheels = wheels;
        this.model = model;
        this.brand = brand;
    }

//Methods
    public int getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(int registerNum) {
        this.registerNum = registerNum;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void parking(){
        System.out.println("I'm parking!!");
    }
}
