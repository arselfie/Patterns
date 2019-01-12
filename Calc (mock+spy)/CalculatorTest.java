/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javaapplication10.lessons.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Before
    public void beforeEachTest() {
//        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
//        System.out.println("After each test");
    }

    @BeforeClass
    public static void beforeAllTests() {
//        System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
//        System.out.println("After all tests");
    }

    @Mock
    private Calculator mock;

    @Spy
    private Calculator calcSpy;

    @Test
    @Ignore
    public void shouldReturnSumValues() {
        Calculator calculator = new Calculator();

        Assert.assertEquals("Should return 5", 5, calculator.sum(1, 3));
    }

    @Test
    public void shouldReturnSumValues1() {
        Calculator calculator = new Calculator();

        Assert.assertEquals("Should return 5", 5, calculator.sum(2, 3));
    }

    @Test
    public void shouldMockMethod() {
        //Calculator mock = Mockito.mock(Calculator.class);

        Mockito.when(mock.getValue()).thenReturn(12);

        Mockito.when(mock.sumRandom(anyInt())).thenCallRealMethod();

        Assert.assertEquals(19, mock.sumRandom(7));
    }

    @Test
    public void shouldMockSubstract() {
        //Calculator mock = Mockito.mock(Calculator.class);

        Mockito.when(mock.getValue()).thenReturn(20);

        Mockito.when(mock.subtractFrom(50)).thenCallRealMethod();

        Assert.assertEquals(30, mock.subtractFrom(50));

    }

    @Test
    public void shouldMockSubstractUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(20);

        Assert.assertEquals(30, calcSpy.subtractFrom(50));

    }
    //---------------------------------------------------

    @Test
    public void shouldMockMultiply() {

        Mockito.when(mock.getValue()).thenReturn(10);

        Mockito.when(mock.multiply(anyInt())).thenCallRealMethod();

        Assert.assertEquals(50, mock.multiply(5));

    }

    @Test
    public void shouldMockMultiplyUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(20);

        Assert.assertEquals(100, calcSpy.multiply(5));

    }

    @Test
    public void shouldMockDivide() {

        Mockito.when(mock.getValue()).thenReturn(5);

        Mockito.when(mock.divide(100)).thenCallRealMethod();

        Assert.assertEquals(20, mock.divide(100));
    }

    @Test
    public void shouldMockDivideUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(2);

        Assert.assertEquals(25, calcSpy.divide(50));

    }

    @Test
    public void shouldMockDivideWithRemainder() {

        Mockito.when(mock.getValue()).thenReturn(5);

        Mockito.when(mock.divideWithRemainder(17)).thenCallRealMethod();

        Assert.assertEquals(2, mock.divideWithRemainder(17));
    }
    
    @Test
    public void shouldMockDivideWithRemainderUsingSpy(){
        
        Mockito.when(calcSpy.getValue()).thenReturn(5);
        
        Assert.assertEquals(1, calcSpy.divideWithRemainder(21));
    }
    
     @Test
    public void shouldMockStaticMethod(){
                
        Mockito.when(Calculator.getRandomNumber()).thenReturn(15);
        
        Assert.assertEquals(15, Calculator.getRandomNumber());
        
    }
    
    
}
