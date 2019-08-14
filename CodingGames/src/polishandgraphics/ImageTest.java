package polishandgraphics;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class ImageTest extends PApplet{
    // Variables
    public PImage dude;
    public PImage bg;

    public static void main(String[] args) {
        PApplet.main("polishandgraphics.ImageTest");
    }

    public void settings() {
        size(300,300);
    }

    public void setup() {
        surface.setTitle("HARAMBE WAS AN INSIDE JOB");
        dude = loadImage("photos/0.jpg");
        dude.resize(0,360);
        dude.filter(BLUR,6);

        bg = loadImage("photos/bg.jpg");
        bg.filter(INVERT);
    }

    public void draw() {
        //background(255);
        background(bg);

        tint(0,255,0,200);
        image(dude, 0, 0);
    }
}
