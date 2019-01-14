/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.lessons.patterns.builder;

/**
 *
 * Порождающий паттерн
 */
public class SimpleBuilder {

    public static void main(String[] args) {
         Car vaz = new CarBuilder()
                 //.buildName("VAZ")//this
                // .buildSpeed(100)
                 .buildTransmission("AUTO")
                 .build();
    }
}

class Car {

    private String name;
    private int speed;
    private String transmission;

    public Car(String name, int speed, String transmission) {
        this.name = name;
        this.speed = speed;
        this.transmission = transmission;
    }

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", speed=" + speed + ", transmission=" + transmission + '}';
    }
    
    

}

class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car("Some car", 120, "MANUAL");
    }

    public CarBuilder buildName(String name) {
        car.setName(name);
        return this;
    }

    public CarBuilder buildSpeed(int speed) {
        car.setSpeed(speed);
        return this;
    }

    public CarBuilder buildTransmission(String transmission) {
        car.setTransmission(transmission);
        return this;
    }

    public Car build() {
        return car;
    }

}
