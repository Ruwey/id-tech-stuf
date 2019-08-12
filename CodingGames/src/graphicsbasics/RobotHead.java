package graphicsbasics;

import processing.core.PApplet;

public class RobotHead extends PApplet{
    public static void main(String[] args) {
        PApplet.main("graphicsbasics.RobotHead");
        //background(FF6492);
        //background(FF6492);
    }

    public void settings(){
        size(700,800);
    }

    public void setup(){
        background(255,100,146);
    }

    public void draw(){
        face(100,300);
    }

    public void face(float xPos, float yPos) {
        fill(0,149,185);
        rect(xPos,yPos,500,300);
        eyes(xPos + 100, yPos + 100);
        mouth(xPos + 100, yPos + 200);
        ear(xPos - 25, yPos + 40, true);
        ear(xPos + 500, yPos + 40, false);
    }

    public void eyes(float xPos, float yPos){
        fill(255,255,255);
        ellipse(xPos,yPos,100,100);
        ellipse(xPos + 300, yPos,100, 100);
    }

    public void mouth(float xPos, float yPos) {
        fill(255,255,255);
        triangle(xPos,yPos,xPos + 300, yPos, xPos + 150, yPos + 100);
    }

    public void ear(float xPos, float yPos, boolean left) {
        fill(255, 127, 46);
        rect(xPos, yPos, 25, 100);
        if (left) {
            rect(xPos - 25, yPos + 12, 25, 75);
            rect(xPos - 50, yPos + 24, 25, 50);
            line(xPos - 38, yPos + 25, xPos - 38, yPos - 200);
            fill(255, 255, 255);
            ellipse(xPos - 38, yPos - 200, 30, 30);
        } else {
            rect(xPos + 25, yPos + 12, 25, 75);
            rect(xPos + 50, yPos + 25, 25, 50);
            line(xPos + 62, yPos + 25, xPos + 62, yPos - 200);
            fill(255, 255, 255);
            ellipse(xPos + 62, yPos - 200, 30, 30);
        }
    }
}
