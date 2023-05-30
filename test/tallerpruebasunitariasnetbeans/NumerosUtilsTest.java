/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebasunitariasnetbeans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dasgo
 */
public class NumerosUtilsTest {
    
    public NumerosUtilsTest() {
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
     * Test of esPrimo method, of class NumerosUtils.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int numero = 7;
        boolean expResult = true;
        boolean result = NumerosUtils.esPrimo(numero);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
}
