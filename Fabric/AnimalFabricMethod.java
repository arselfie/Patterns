package javaapplication10.lessons.patterns;

public class AnimalFabricMethod {

}

interface SomeAnimal {

//    default void sound() {
//        System.out.println("Some sound");
//    }
    public abstract String sound();

}

abstract class CreatorOfAnimal {

    abstract SomeAnimal getAnimal();

}

class Lion implements SomeAnimal {

    @Override
    public String sound() {
        return "R-r-r-r-r";
    }

}

class Cow implements SomeAnimal {

    @Override
    public String sound() {
        return "Mo-o-o-o";
    }

}

class Mouse implements SomeAnimal {

    @Override
    public String sound() {
        return "Pi-i-i-i";
    }

}

class LionCreator extends CreatorOfAnimal {

    @Override
    SomeAnimal getAnimal() {
        return new Lion();
    }

}

class CowCreator extends CreatorOfAnimal {

    @Override
    SomeAnimal getAnimal() {
        return new Cow();
    }

}

class MouseCreator extends CreatorOfAnimal {

    @Override
    SomeAnimal getAnimal() {
        return new Mouse();
    }

}
