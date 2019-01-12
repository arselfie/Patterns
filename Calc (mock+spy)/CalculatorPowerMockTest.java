/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import javaapplication10.lessons.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class CalculatorPowerMockTest {

    @Test
    public void shouldMockStaticMethod() {

        PowerMockito.mockStatic(Calculator.class);

        Mockito.when(Calculator.getRandomNumber()).thenReturn(15);

        Assert.assertEquals(15, Calculator.getRandomNumber());

    }

    @Test
    public void shouldMockPrivateMethod() throws Exception {

        Calculator calculator = new Calculator();

        Calculator calcSpy = PowerMockito.spy(calculator);

        PowerMockito.doReturn(5).when(calcSpy, "getValuePrivate");

        Assert.assertEquals(12, calcSpy.sumWithPrivate(7));

    }

    @Test
    public void shouldMockPrivateMethoWithArgs() throws Exception {

        Calculator calculator = new Calculator();

        Calculator calcSpy = PowerMockito.spy(calculator);

        PowerMockito
                .when(calcSpy,
                        MemberMatcher.method(Calculator.class, 
                                "sumWithPrivateWithArgs", int.class))
                .withArguments(8)
                .thenReturn(5);

        Assert.assertEquals(12, calcSpy.sumWithPrivateWithArgs(7));

    }

}
