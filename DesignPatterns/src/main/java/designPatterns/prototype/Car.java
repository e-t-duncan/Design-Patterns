package designPatterns.prototype;

public class Car extends Vehicle{
    public String colour;

    public Car(int wheels, long price, String colour){
        this.wheels = wheels;
        this.price = price;
        this.colour=colour;
    }

    public Car(Car target){
        super(target);
        if(target!=null){
            colour = target.colour;
        }
    }


    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Car){
            Car t = (Car) target;
            if(colour == t.colour && wheels == t.wheels && price == t.price){
                System.out.println("They are clones");
                return true;
            }
        }
        System.out.println("Not clones");
        return false;
    }
}
