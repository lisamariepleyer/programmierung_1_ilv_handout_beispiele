package O6_UE4_OO;

public class Car {
    private String brand;
    private int permitYear;
    private String typeOfEngine;
    private int speed;

    public Car(String brand, int permitYear, String typeOfEngine, int speed) {
        this.brand = brand;
        this.permitYear = permitYear;
        this.typeOfEngine = typeOfEngine;
        this.speed = speed;
    }

    public Car(String brand, int permitYear){
        this.brand = brand;
        this.permitYear = permitYear;
        this.typeOfEngine = null;
        this.speed = 0;
    }

    public void honk(){
        System.out.println(this.brand + ": beep beep!");
    }

    public boolean isElectric(){
        return "electric".equals(this.typeOfEngine);
    }

    public int accelerate(){
        this.speed += 10;
        return this.speed;
    }

    public int accelerate(int acc){
        this.speed += acc;
        return this.speed;
    }

    public int brake(){
        this.speed -= 10;
        return this.speed;
    }

    public int brake(int br){
        this.speed -= br;
        return this.speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPermitYear() {
        return permitYear;
    }

    public void setPermitYear(int permitYear) {
        this.permitYear = permitYear;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
