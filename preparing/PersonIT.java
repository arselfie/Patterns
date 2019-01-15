package javaapplication10.lessons.preparing;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Ars
 */

public class PersonIT {

    public PersonIT() {
    }

    private Methods methods = new Methods();

    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        Person person = new Person(15, "Jack", 170);

        assertEquals(person.getAge(), 15);
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        Person person = new Person(15, "Jack", 170);

        assertEquals(person.getName(), "Jack");
    }

    /**
     * Test of getHeight method, of class Person.
     */
    @Test
    public void testGetHeight() {
        Person person = new Person(15, "Jack", 170);

        assertEquals(person.getHeight(), 170);
    }

    @Test
    public void shouldshowPersonByMinimalAge() {

        List<Person> list = new ArrayList<Person>();

        Person vova = new Person(15, "vova", 150);
        Person masha = new Person(17, "masha", 170);

        list.addAll(Arrays.asList(vova, masha));

        methods.showPersonByMinimalAge((ArrayList<Person>) list, 16);

        assertEquals(masha, methods.showPersonByMinimalAge((ArrayList<Person>) list, 16));
    }
   
    @Test
    public void shouldDisplayString() {

        Methods methods= new Methods();
        
        methods.displayString("hello");
        
        String log = outRule.getLog();

        Assert.assertTrue(log.contains("hello")); 
                        
    }
    
    @Test
    public void shouldDisplayIntegerValue() {

        Methods methods= new Methods();
        
        methods.displayIntegerValue(5);
        
        String log = outRule.getLog();

        Assert.assertTrue(log.contains("Value = 5")); 
                        
    }
    
    
    

}
