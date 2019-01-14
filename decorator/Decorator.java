package javaapplication10.lessons.patterns.decorator;

import java.io.FileReader;
import java.util.Objects;

/**
 *
 * @author Ars
 */
public class Decorator {

    public static void main(String[] args) {//[\Hello\]
//        new BackSlash(new LeftBracket(new RightBracket(new RealPrinter("Hello")))).print();
        new LeftCurlyBracket(new LeftBracket(new BackSlash(new RightCurlyBracket(new RightBracket(new RealPrinter("Hello")))))).print();
    }

}

interface Printable {

    void print();
}

class RealPrinter implements Printable {

    private String text;

    public RealPrinter(String text) {
        this.text = text;
                
    }

    @Override
    public void print() {

        System.out.print(text);
    }

}

class RightBracket implements Printable {

    private Printable printable;

    public RightBracket(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("]");
    }

}

class LeftBracket implements Printable {

    private Printable printable;

    public LeftBracket(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("[");
        printable.print();
    }

}

class BackSlash implements Printable {

    private Printable printable;

    public BackSlash(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("\\");
        printable.print();
        System.out.print("\\");
    }

}

class LeftCurlyBracket implements Printable {

    private Printable printable;

    public LeftCurlyBracket(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("{");
        printable.print();

    }

}

class RightCurlyBracket implements Printable {

    private Printable printable;

    public RightCurlyBracket(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("}");

    }

}
