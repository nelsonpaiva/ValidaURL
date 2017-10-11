package ValidaURL.ValidaURL;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidaURLTest {
    
    public ValidaURLTest() {
    }
    

    public static void setUpClass() {
    }
    

    public static void tearDownClass() {
    }
    

    public void setUp() {
    }
    
    
    public void tearDown() {
    }

    @Test
    public void testUrl() {
        System.out.println("TESTE-1");
        String url = "http://www.google.com/mail/user=fulano";
        ValidaURL instance = new ValidaURL();
        boolean expResult = true;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testUrl2() {
        System.out.println("TESTE-2");
        String url = "http://www.facebook.com/phothos/user=joao";
        ValidaURL instance = new ValidaURL();
        boolean expResult = true;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
    @Test
    public void testUrl3() {
        System.out.println("TESTE-3");
        String url = "http://ww1.facebook.com/phothos/=joao";
        ValidaURL instance = new ValidaURL();
        boolean expResult = false;
        boolean result = instance.url(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
}

