package graphicsbasics;

import processing.core.PApplet;

public class MyFirstProject extends PApplet {

    public static void main(String[] args) {
        PApplet.main("graphics.basics.MyFirstProject");
        System.out.println("Hello There");
    }

    public void settings() {
        size (500, 500);
    }

    public void setup() {
        background(255,100,146);
    }

    public void draw() {
    }

}
