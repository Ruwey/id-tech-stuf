package graphicsbasics.robothead;

import processing.core.PApplet;

public class RobotHead extends PApplet{
    public static void main(String[] args) {
        PApplet.main("graphicsbasics.robothead.RobotHead");
        //background(FF6492);
        //background(FF6492);
    }

    public void settings(){
        size(700,800);
    }

    public void setup(){
        background(355,100,146);
    }

    public void draw(){
        face(100,300);
    }

    public void face(float xPos, float yPos) {
        fill(0,149,185);
        rect(xPos,yPos,500,300);
        eyes(xPos + 100, yPos + 100);
    }

    public void eyes(float xPos, float yPos){
        fill(255,255,255);
        ellipse(xPos,yPos,100,100);
        ellipse(xPos + 300, yPos,100, 100);
    }
}
