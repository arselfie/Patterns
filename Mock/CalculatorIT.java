package javaapplication10.lessons;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorIT {
    
    public CalculatorIT() {
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
    
    @Mock
    private Calculator mock;
    
    @Spy
    private Calculator calcSpy;

    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        
        int sumResult = calculator.sum(5, 7);
        
        Assert.assertEquals(12, sumResult);
    }

    /**
     * Test of sumRandom method, of class Calculator.
     */
    @Test
    public void testSumRandom() {
        Mockito.when(mock.getValue()).thenReturn(10);
        
        Mockito.when(mock.sumRandom(5)).thenCallRealMethod();
        
        int result = mock.sumRandom(5);
        
        Assert.assertEquals(15, result);
        
    }

    /**
     * Test of getValue method, of class Calculator.
     */
    @Test
    public void testGetValue() {
        Mockito.when(mock.getValue()).thenReturn(10);
        
        Assert.assertEquals(10, mock.getValue());
    }

    /**
     * Test of subtractFrom method, of class Calculator.
     */
    @Test
    public void testSubtractFrom() {
        Mockito.when(mock.getValue()).thenReturn(10);
        
        Mockito.when(mock.subtractFrom(15)).thenCallRealMethod();
        
        int result = mock.subtractFrom(15);
        
        Assert.assertEquals(5, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        Mockito.when(mock.getValue()).thenReturn(10);
        
        Mockito.when(mock.multiply(15)).thenCallRealMethod();
        
        int result = mock.multiply(15);
        
        Assert.assertEquals(150, result);
        
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        Mockito.when(mock.getValue()).thenReturn(10);
        
        Mockito.when(mock.divide(150)).thenCallRealMethod();
        
        int result = mock.divide(150);
        
        Assert.assertEquals(15, result);
    }

    /**
     * Test of divideWithRemainder method, of class Calculator.
     */
    @Test
    public void testDivideWithRemainder() {
        System.out.println("divideWithRemainder");
        int a = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divideWithRemainder(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomNumber method, of class Calculator.
     */
    @Test
    public void testGetRandomNumber() {
        System.out.println("getRandomNumber");
        int expResult = 0;
        int result = Calculator.getRandomNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomNumberInRange method, of class Calculator.
     */
    @Test
    public void testGetRandomNumberInRange() {
        System.out.println("getRandomNumberInRange");
        int expResult = 0;
        int result = Calculator.getRandomNumberInRange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
