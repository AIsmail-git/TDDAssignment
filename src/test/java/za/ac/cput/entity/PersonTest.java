package za.ac.cput.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;


/*
    Ameer Ismail
    PersonTest java class
    TDD assignment
    218216033
*/


class PersonTest
{
    private PersonTest pn1, pn2, pn4;

    @BeforeEach
    void setUp()
    {
        pn1 = new PersonTest();
        pn2 = new PersonTest();
        pn4 = pn2;
    }

    @Test
    public void testIdentity() {
        assertSame(pn4, pn2);     // test identity/ same
    }

    @Test
    public void testEquality()
    {
        assertEquals(pn2, pn4);   // test equality
    }

    @Test
    public void testSetHeight()
    {
        fail("this will fail automatically");    // test failure

    }

    @Test
    @Timeout(3000)
    public void age() throws InterruptedException
    {
        Thread.sleep(2000);     // take longer to process
    }

    @Disabled
    @Test
    public void testGetGender()
    {
        System.out.println("Gender = male");    // this will be ignored
    }

}