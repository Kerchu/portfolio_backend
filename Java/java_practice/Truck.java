package java_practice;

public class Truck extends Vehicle {
//Atributes
    int axis;
    boolean linked;
    
//Construct
    public Truck() {}
    
    public Truck(int registerNum, int wheels, String model, String brand, int axis, boolean linked) {
        super(registerNum, wheels, model, brand);
        this.axis = axis;
        this.linked = linked;
    }

//Methods
    public int getAxis() {
        return axis;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public boolean isLinked() {
        return linked;
    }

    public void setLinked(boolean linked) {
        this.linked = linked;
    }
}