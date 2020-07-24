/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciii;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cdeme
 */
public class FibonacciIITest {
    
    /*public FibonacciIITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */
    FibonacciII fibonacci;
    @Before
    public void setUp()throws Exception {
        fibonacci = new FibonacciII();
    }
    
    /*@After
    public void tearDown() {
    }*/

    /**
     * Test of main method, of class FibonacciII.
     */
    @Test
    public void testMain() {
        Assert.assertEquals(1,0);
    }
    
}
