/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.entity;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;


/**
 *Unit Testing
 * 06 Feb 2022
 * @author Lyle Haines - 217245919
 */

public class DogTest {
    
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;
    
    public DogTest() {
    }
    
    @BeforeEach
    public void setUp() {
        dog1 = new Dog();
        dog2 = new Dog();
        dog3 = dog1;  
    }

    @Test
    public void testEquality() {
        assertEquals(dog1,dog3);
    }

    @Test
    public void testIdentity() {
        assertNotSame(dog2,dog3);
    }

    @Test
    @Timeout(2)
    public void testTimeout() {
        assertEquals(dog1, dog3);
    }

    @Test
    public void testFail(){

    }

    @Test
    @Disabled
    public void testDisable() {
        System.out.println("Unsuccessful");
    }
}
