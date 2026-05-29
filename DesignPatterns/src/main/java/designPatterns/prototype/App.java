package designPatterns.prototype;

public class App {
    public static void main(String[] args) {
        Car car = new Car(4, 300000, "Blue");
        Vehicle car2 = car.clone();

        car.isClone(car2);
    }
}
