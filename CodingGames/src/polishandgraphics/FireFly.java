package polishandgraphics;

import processing.core.PApplet;

public class FireFly extends PApplet {
    // Variables
    float xPos;
    float yPos;
    float lightGValue;

    public static void main(String[] args) {
        PApplet.main("polishandgraphics.FireFly");
    }

    public void settings() {
        size(450, 450);
    }

    public void setup() {
        xPos = width / 2;
        yPos = height / 2;
        lightGValue = 165;

    }

    public void draw() {
        background(255);

        shake();
        changeLight();

        drawFireFly(xPos, yPos);
    }

    void drawFireFly(float x, float y) {
        noStroke();

        // Head
        fill(128, 0, 0);
        ellipse(x, y - 110, 50, 50);

        // Body
        fill(0, 153, 255);
        ellipse(x,y,50, 200);

        // Wings
        y -= 5;
        fill(255, 153, 153, 200);
        triangle(x + 5, y, x + 150, y + 25, x + 70, y - 35);
        triangle(x - 5, y, x - 150, y + 25, x - 70, y - 35);
        y += 5;

        // Light
        fill(255, lightGValue, 0);
        ellipse(x, y + 85, 30, 30);
    }

    void shake() {
        xPos = xPos + random(-1,1);
        xPos = constrain(xPos, 0, width);

        yPos = yPos + random(-1,1);
        yPos = constrain(yPos, 0, height);
    }

    void changeLight() {
        lightGValue = random(120) + 135;
    }
}
