package java_practice;
public class Car extends Vehicle{
//Atributes
    private int id;
    private String patent;
    private int doorNum;
    private String color;
    private boolean manualGearbox;

//Construct
    public Car(){}
    
    public Car(int registerNum, int wheels, String model, String brand, int id, String patent, int doorNum, String color, boolean manualGearbox) {
        super(registerNum, wheels, model, brand);
        this.id = id;
        this.patent = patent;
        this.doorNum = doorNum;
        this.color = color;
        this.manualGearbox = manualGearbox;
    }

    //Methods
    public int getId() {
        return id ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isManualGearbox() {
        return manualGearbox;
    }

    public void setManualGearbox(boolean manualGearbox) {
        this.manualGearbox = manualGearbox;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", patent=" + patent + ", doorNum=" + doorNum + ", color=" + color + ", manualGearbox="
                + manualGearbox + "]";
    }

    public void turnOn(){
        System.out.println("Turning on...");
    }

    public void turnOff(){
        System.out.println("Turning off...");
    }

    public void acelerate(double km){
        System.out.println("I'm accelerating " + km + " km/h");
    }

    public void stop(double km){
        System.out.println("I'm stopping " + km + " km/h");
    }
}