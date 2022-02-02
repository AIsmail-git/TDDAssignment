/**
 * Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.model.GenerateCars;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateCarsTest {

    //Object Equality
    @Test
    void testEquality(){
        Car car = new Car();
        GenerateCars gen = new GenerateCars();
        boolean expected = true;
        boolean actual = gen.addCar(car);
        assertEquals(expected,actual);
    }

    //Object Identity
    Car carA = new Car(1,"Kazaki",32324,324342);
    Car carB = new Car(1,"Kazaki",32324,324342);

    @Test
    void testIdentity(){
        assertSame(carA,carA);
    }

    @Test
    void testNotIdentical(){
        //Checks if object's not identical
        assertNotSame(carA,carB);
    }

    //Failing Test
    @Test
    void testFailure(){
        try{
           // fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    //Timeout
    @Test
    @Timeout(5)
    void timeout() throws InterruptedException{
        TimeUnit.SECONDS.sleep(5);
    }

    //DisablingTest
    @Disabled
    @Test
    void testIgnore(){
        //Checks if object's not identical
        assertNotSame(carA,carB, "Checks for object Identity between the two classed");
    }


}
