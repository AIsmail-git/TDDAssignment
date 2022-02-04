package za.ac.cput.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Manasseh Barnes - 218009615
 */
class AnimalTest {
    private AnimalTest animalTest1, animalTest2, animalTest3;

    @BeforeEach
    void setUp() {
        animalTest1 = new AnimalTest();
        animalTest2 = new AnimalTest();
        animalTest3 = animalTest2;
    }

    @Test
    public void testIdentity(){
        assertSame(animalTest3, animalTest2);
    }

    @Test
    public void testEquality(){
        assertEquals(animalTest2, animalTest3);
    }

    @Test
    public void failedTest(){
        fail("automatic failure");
        assertEquals(animalTest1, animalTest2);
    }

    @Test
    @Timeout(10)
    public void testTimeout() throws InterruptedException{
        while(true) {
            Thread.sleep(300);
        }
    }

    @Disabled
    @Test
    public void disabledTest(){
        assertNotSame(animalTest1, animalTest3);
    }


}