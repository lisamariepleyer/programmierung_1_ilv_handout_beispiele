package O6_UE4_OO;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mini", 2006, "benzin", 90);
        car1.honk();
        System.out.println(car1.isElectric());

        Car car2 = new Car("bmw", 2022, "electric", 100);
        System.out.println(car2.isElectric());

        Car car3 = new Car("audi", 2001);
        System.out.println(car3.getSpeed());
        car3.setSpeed(120);
        System.out.println(car3.getSpeed());

        car1.accelerate();
        System.out.println(car1.getSpeed());

        car1.brake();
        System.out.println(car1.getSpeed());

        car1.accelerate(60);
        System.out.println(car1.getSpeed());
    }
}
