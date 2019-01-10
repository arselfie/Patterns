package javaapplication10.lessons.patterns;

public class MusicalInstrumentsFabric {

}

interface SomeInstruments {

    public abstract String sound();
}

abstract class CreatorOfInstrument {

    abstract SomeInstruments getInstrument();
}

class Piano implements SomeInstruments {

    @Override
    public String sound() {
        return "Piano-sound";
    }

}

class Guitar implements SomeInstruments{

    @Override
    public String sound() {
        return "Guitar-sound";
    }    
    
}

class Violin implements SomeInstruments{

    @Override
    public String sound() {
        return "Violin-sound";
    }
    
}

class PianoCreator extends CreatorOfInstrument{

    @Override
    SomeInstruments getInstrument() {
        return new Piano();
    }
    
}

class GuitarCreator extends CreatorOfInstrument{

    @Override
    SomeInstruments getInstrument() {
        return new Guitar();
    }
    
}

class ViolinCreator extends CreatorOfInstrument{

    @Override
    SomeInstruments getInstrument() {
        return new Violin();
    }
    
}
