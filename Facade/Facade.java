/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.lessons.patterns;

/**
 *
 * Structural pattern
 */
public class Facade {
    public static void main(String[] args) {
        new Computer().start();
    }
}


class Computer {
    public void start() {
        new Os().load();
        new HardDrive().start();
        new Cpu().start();
    }
}

class Os {
    public void load() {
        System.out.println("Load OS");
    }
}

class HardDrive {
    public void start() {
        System.out.println("Start hard disk");
    }
}

class Cpu {
    public void start() {
        System.out.println("Start cpu");
    }
}