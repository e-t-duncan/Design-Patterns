package factory;

import designPatterns.factory.Shape;
import designPatterns.factory.ShapeFactory;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class FactoryTest {

    ShapeFactory factory = new ShapeFactory();
    Shape roundFound = factory.getFood("Round");
    Shape cylinderFood = factory.getFood("Cylinder");

    @Test
    void factoryMethodTest(){
        assertEquals("Round", roundFound.getShape());
        assertEquals("Cylinder", cylinderFood.getShape());
    }


}
