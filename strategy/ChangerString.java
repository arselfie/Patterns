package javaapplication10.lessons.patterns.strategy;

/**
 *
 * @author Ars
 */
public class ChangerString {

}

interface Changeable {

    String change(String text);
}

class HelloChanger implements Changeable {

    @Override
    public String change(String text) {
        return "Hello".concat(text);
    }

}

class GoodByeChanger implements Changeable {

    @Override
    public String change(String text) {
        return "Good-Bye".concat(text);
    }

}

class StrategyChangeable {

    private Changeable changeable;

    public StrategyChangeable(Changeable changeable) {
        this.changeable = changeable;
    }

    public void setChangeable(Changeable changeable) {
        this.changeable = changeable;
    }
    
    

    void execute(String text) {
        System.out.println(changeable.change(" ".concat(text)));
    }

}

class TestStrategyChangeable {

    public static void main(String[] args) {
        Changeable hello = new HelloChanger();

        Changeable bye = new GoodByeChanger();

        StrategyChangeable strategyChangeable = new StrategyChangeable(hello);
               

        strategyChangeable.execute("world");
        
        
        strategyChangeable.setChangeable(bye);
        
        strategyChangeable.execute("world");              

    }

}
