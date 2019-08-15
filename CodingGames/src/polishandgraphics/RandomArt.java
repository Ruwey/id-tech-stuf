package polishandgraphics;

import processing.core.PApplet;

public class RandomArt extends PApplet {
    // Variables
    // Ellipse properties
    float xPos;
    float yPos;
    float r;
    float g;
    float b;
    float a;
    float diameter;

    // Timer
    float startTime;
    float timer;

    public static void main(String[] args) {
        PApplet.main("polishandgraphics.RandomArt");
    }

    public void settings() {
        size(450, 450);
    }

    public void setup() {
        background(255);

        startTime = millis();
    }

    public void draw() {
        timer = millis() - startTime;

        if (timer >= 300) {
            // Gen random values
            xPos = random(width);
            yPos = random(height);
            r = random(255);
            g = random(255);
            b = random(255);
            a = random(255);
            diameter = random(100) + 50;

            // Draw ellipse
            noStroke();
            fill(r, g, b, a);
            ellipse(xPos, yPos, diameter, diameter);
            startTime = millis();
        }
    }
}
