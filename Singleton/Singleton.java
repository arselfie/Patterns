/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.lessons.patterns;

import java.util.Objects;
/**
 *
 * Creational pattern
 * Создается для создания одного объекта
 */
public class Singleton {
    public static void main(String[] args) {
        Dog dog = Dog.getInstance("Jack", 10);
        
        System.out.println(dog);
        
        Dog dog1 = Dog.getInstance("John", 25);
        
        System.out.println(dog1);

    }
}

class Dog {
    private String name;
    private int age;
    
    private static Dog dog;

    private Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static Dog getInstance(String name, int age) {
        if(dog == null) {
            dog = new Dog(name, age);
        }
        
        return dog;      
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
