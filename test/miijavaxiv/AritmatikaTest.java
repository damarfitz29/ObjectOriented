/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS 10
 */
public class AritmatikaTest {
    
    public AritmatikaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bagi method, of class Aritmatika.
     */
    @org.junit.Test
    public void testBagi() {
        System.out.println("bagi");
       
        Aritmatika instance = new Aritmatika();
        
        assertEquals(5, instance.bagi(10, 2), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = ArithmeticException.class)
    public void testBagiNol() {
        System.out.println("bagi dengan nol");
        
        Aritmatika instance = new Aritmatika();
        instance.bagi(10, 0);
//        assertEquals(5, instance.bagi(10, 2), 0.0);
    }
}
