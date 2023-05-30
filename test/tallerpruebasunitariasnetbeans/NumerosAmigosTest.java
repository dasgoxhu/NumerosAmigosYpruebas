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
public class NumerosAmigosTest {
    
    public NumerosAmigosTest() {
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
     * Test of sumdeDiv method, of class NumerosAmigos.
     */
    @Test
    public void testSumdeDiv() {
        System.out.println("sumdeDiv");
        int x = 220;
        int expResult = 284;
        int result = NumerosAmigos.sumdeDiv(x);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("The test case is a prototype.");
        }   
    }

    /**
     * Test of esAmigo method, of class NumerosAmigos.
     */
    @Test
    public void testEsAmigo() {
        System.out.println("esAmigo");
        int a = 220;
        int b = 284;
        boolean expResult = true;
        boolean result = NumerosAmigos.esAmigo(a, b);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("The test case is a prototype.");
        }   
    }

    /**
     * Test of contarPareja method, of class NumerosAmigos.
     */
    @Test
    public void testContarPareja() {
        System.out.println("contarPareja");
        int[] arr = new int[6];
        arr [0] = 220;
        arr [1] = 284;
        arr [2] = 1184;
        arr [3] = 1210;
        arr [4] = 2620;
        arr [5] = 2924;
        
        int n = 2;
        int expResult = 1;
        int result = NumerosAmigos.contarPareja(arr, n);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("The test case is a prototype.");
        }   
    }
    /**
     * Test of main method, of class NumerosAmigos.
     */
    @Test
    public void testMain() {
        int arr1[] = { 220, 284, 1184,
                 1210, 2, 5 };
        int n1 = arr1.length;
        System.out.println("main");
        String[] args = null;
        NumerosAmigos.main(args);
        int expResult = 2;
        int result = NumerosAmigos.contarPareja(arr1, n1);
        assertEquals(expResult, result);
        if (result != expResult)
        {
            fail("The test case is a prototype.");
        } 
    }  
}
