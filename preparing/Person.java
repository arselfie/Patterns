package javaapplication10.lessons.preparing;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ars
 */
public class Person {

    private int age;
    private String name;
    private int height;

    public Person(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + ", height=" + height + '}';
    }

}

class Methods {

    void showPersonByMinimalAge(ArrayList<Person> persons, int minimalAge) {
        for (int i = 0; i < persons.size(); i++) {

            if (Objects.isNull(persons)) {
                throw new NullPointerException();

            }
            if (persons.get(i).getAge() >= minimalAge) {

                System.out.println(persons.get(i));
            }
        }
    }

    void showPersonByMinimalHeight(ArrayList<Person> persons, int minimalHeight) {
        for (int i = 0; i < persons.size(); i++) {

            if (Objects.isNull(persons)) {
                throw new NullPointerException();

            }
            if (persons.get(i).getHeight() >= minimalHeight) {

                System.out.println(persons.get(i));
            }
        }
    }

}

class Creator {

    public static void main(String[] args) {
        Person vova = new Person(25, "Vova", 150);
        Person masha = new Person(30, "Masha", 170);
        Person dasha = new Person(29, "Dasha", 175);
        Person marina = new Person(22, "Marina", 155);
        Person katherine = new Person(37, "Katherine", 180);
        Person johanna = new Person(35, "Johanna", 200);
        Person tanya = new Person(17, "Tanya", 168);
        Person galina = new Person(150, "Galina", 175);

        List<Person> list = new ArrayList<Person>();
//        list.add(vova);
//        list.add(masha);
//        list.add(dasha);

        list.addAll(Arrays.asList(vova, masha, dasha, marina, katherine, johanna, tanya, galina));

        System.out.println("---------------");

        Methods methods = new Methods();

        System.out.println(list);
        System.out.println("---------------");

        methods.showPersonByMinimalAge((ArrayList<Person>) list, 29);
        System.out.println("---------------");
        
        methods.showPersonByMinimalHeight((ArrayList<Person>) list, 190);

    }

}
