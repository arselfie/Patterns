/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.lessons.patterns;

/**
 *
 * Behavoiral pattern
 */
public abstract class HouseTemplate {
    public final void buildHouse() {
        installFoundation();
        buildPillars();
        buildWindows();
        buildWalls();
        System.out.println("House is built");
    }
    
    private void buildWindows() {
        System.out.println("Install windows");
    }
    
    private void installFoundation() {
        System.out.println("Install foundation");
    }
    
    public abstract void buildWalls();
    
    public abstract void buildPillars();
}

class WoodHouse extends HouseTemplate {
            
    public void buildWalls() {
        System.out.println("Build wood walls");
    }
    
    public void buildPillars() {
            System.out.println("Build wood pillars");
    }
}

class GlassHouse extends HouseTemplate {
            
    public void buildWalls() {
        System.out.println("Build glass walls");
    }
    
    public void buildPillars() {
            System.out.println("Build glass pillars");
    }
}

class TestTemplateMethod {
    public static void main(String[] args) {
        HouseTemplate woodHouse = new WoodHouse();
        
        woodHouse.buildHouse();
        
        HouseTemplate glassHouse = new GlassHouse();
        
        glassHouse.buildHouse();
    }
}


