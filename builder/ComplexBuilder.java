package javaapplication10.lessons.patterns.builder;

/**
 *
 * @author Ars
 */
public class ComplexBuilder {

    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setCarBuilder(new BMWBuilder());
        
        Car bmw = manager.buildCar();
        
        manager.setCarBuilder(new FordBuilder());
        
        Car ford = manager.buildCar();
        
        System.out.println(bmw);
        System.out.println("---------------");
        System.out.println(ford);
    }

}

abstract class CarBuilderComplex {

    protected Car car;

    public CarBuilderComplex() {
        this.car = new Car();
    }

    abstract void buildName();

    abstract void buildSpeed();

    abstract void buildTransmission();

    public Car build() {
        return car;
    }

}

class BMWBuilder extends CarBuilderComplex {

    @Override
    void buildName() {
        car.setName("BMW");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(250);
    }

    @Override
    void buildTransmission() {
        car.setTransmission("AUTO");
    }

}

class FordBuilder extends CarBuilderComplex {

    @Override
    void buildName() {
        car.setName("Ford");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(200);
    }

    @Override
    void buildTransmission() {
        car.setTransmission("MANUAL");
    }

}

class Manager {

    private CarBuilderComplex carBuilder;

    public void setCarBuilder(CarBuilderComplex carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar() {

        carBuilder.buildName();
        carBuilder.buildSpeed();
        carBuilder.buildTransmission();

        return carBuilder.build();

    }

}
