package javaapplication10.lessons.patterns;

public class AnimalFabricMethodWIthSwitch {

}

interface SomeAnimals {

    public abstract String sound();
}

abstract class CreatorOfAnimals {

    abstract SomeAnimals getAnimal(String name);

}

class Lions implements SomeAnimals {

    @Override
    public String sound() {
        return "R-r-r-r-r";
    }

}

class Cows implements SomeAnimals {

    @Override
    public String sound() {
        return "Mo-o-o-o";
    }

}

class Mouses implements SomeAnimals {

    @Override
    public String sound() {
        return "Pi-i-i-i";
    }

}

class AnimalsCreator extends CreatorOfAnimals {

    @Override
    SomeAnimals getAnimal(String name) {
        switch (name) {

            case "Lion":
                return new Lions();
            case "Cow":
                return new Cows();
            case "Mouse":
                return new Mouses();
            default:
                return new Lions();

        }

    }

}
