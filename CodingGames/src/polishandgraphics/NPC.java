package polishandgraphics;

import processing.core.PApplet;
import processing.core.PFont;

public class NPC extends PApplet {
    // Variables
    public PFont npcFont;
    public PFont usrFont;
    int textYLocation;

    public static void main(String[] args) {
        PApplet.main("polishandgraphics.NPC");
        String[] fontList = PFont.list(); printArray(fontList);
    }

    public void setup() {
        npcFont = createFont("DejaVu Sans", 10, true);
        usrFont = createFont("Tlwg Typist", 16,true);
    }

    public void settings() {
        size(600, 500);
    }

    public void draw() {
        background(161, 174, 255);
        textYLocation = 1;

        drawNPCText("Hello adventurer!");
        drawUsrText("Greetings!");
        drawNPCText("Whats your name?");
    }

    public void drawNPCText(String input) {
        textFont(npcFont,28);
        fill(200,100,0);
        textAlign(LEFT);
        text(input, 15, textYLocation * 30);
        textYLocation++;
    }

    public void drawUsrText(String input) {
        textFont(usrFont, 30);
        fill(129, 36, 57);
        textAlign(RIGHT);
        text(input, 585, textYLocation * 30);
        textYLocation++;
    }
}
