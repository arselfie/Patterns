/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.lessons;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

/**
 *
 * @author Ars
 */
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sumRandom(int a) {
        return a + getValue();//0
    }
    
    public int sumWithPrivate(int a) {
        return a + getValuePrivate();//0
    }
    
    public int sumWithPrivateWithArgs(int a) {
        return a + getValuePrivateWithArgs(8);//0
    }

    public int getValue() {
        return new Random().nextInt(20);
    }
    
    private int getValuePrivate() {
        return new Random().nextInt(20);
    }
    
    private int getValuePrivateWithArgs(int value) {
        return new Random().nextInt(value);
    }

    public int subtractFrom(int a) {
        return a - getValue();

    }

    public int multiply(int a) {
        return a * getValue();
    }

    public int divide(int a) {
        return a / getValue();
    }

    public int divideWithRemainder(int a) {
        return a % getValue();
    }
    
    public static int getRandomNumber() {
        return new Random().nextInt(20);//0-19, 5-17
    }
    
    public static int getRandomNumberInRange() {//(max - min + 1) + min)
        return new Random().nextInt(13) + 5;//5-17
    }
    
   
}
