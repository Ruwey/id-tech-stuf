package polishandgraphics;

import processing.core.PApplet;
import processing.core.PFont;

public class NPC extends PApplet {
    // Variables
    public PFont npcFont;
    public PFont usrFont;
    int textYLocation;
    // For name
    String name = "";
    String typing = "";

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
        if (name.length() < 1) {
            drawUsrText(typing);
        } else {
            drawUsrText(name);
            drawNPCText("Hello " + name + '!');
        }
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


    public void keyPressed() {
        if (key == '\n') {                  // Set the current buffer to name
            name = typing;
            typing = "";
        } else if (keyCode == ESC){         // Clear the buffer if the user presses esc
            typing = "";
        } else if (keyCode == BACKSPACE) {  // Remove the last typed character if the user pressed backspace
            if (typing.length() > 0) {
                typing = typing.substring(0, typing.length() - 1);
            }
        } else if (keyCode == SHIFT) {      // Get rid of shift symbols
        } else {                            // Add all non-special keys to buffer
            typing = typing + key;
        }
    }
}
