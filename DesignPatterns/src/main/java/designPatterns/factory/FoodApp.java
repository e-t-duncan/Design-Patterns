package designPatterns.factory;

public class FoodApp {

    ShapeFactory factory = new ShapeFactory();
    Shape roundFound = factory.getFood("Round");
    Shape cylinderFood = factory.getFood("Cylinder");

}
