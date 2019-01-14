package javaapplication10.lessons.patterns.adapter;

/**
 *
 * Структурный паттерн
 */
public class AdapterUSB extends MiniUSB implements MicroUSB {

    @Override
    public void readMicroUSB() {
        readMiniUSB();
    }

    @Override
    public void writeMicroUSB() {
        writeMiniUSB();
    }

}
