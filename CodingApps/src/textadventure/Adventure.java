package textadventure;

import java.util.Scanner;
import java.util.Random;

public class Adventure {
    public static void main(String[] args) {
        // VARIABLES
        char prompt = '>';
        // Get basic player info
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Player Name: ");
        String playerName = input.next();
        int playerLevel = 1;
        double playerHealth = 10.0;
        Random randomGen = new Random();

        System.out.println("Welcome " + playerName + "!");
        System.out.println("Before you is a large cave mouth. All you can see is darkness. " +
                "\nDo you dare enter the cave of wonders");
        System.out.println("1. Enter the cave of wonders.\n2. Go home to the safety of your bed.");
        System.out.print(prompt);
        int playerChoice = input.nextInt();
        if(playerChoice == 1){
            //Player enters the cave
            System.out.println("You successfully enter the cave");
            System.out.println("Fortune favors your bravery. You level up!");
            playerLevel++;

            // Rock Slide
            int rockDmg = randomGen.nextInt(5);
            System.out.println("As you venture farther into the cave, you feel a brush on your leg.\n" +
                    "Its a trap! A group of bolders fall from above.");
            playerHealth -= rockDmg;
            System.out.println("You take " + rockDmg + " points of rock damage." +
                    "\nYou have " + playerHealth + " health remaining.");

            // tutorial.Tresure
            System.out.println("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.");
            System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
            System.out.println("Before you is a treasure chest.");
            boolean hasSword = false;
            System.out.println("1. Open the chest.");
            System.out.println("2. Ignore the chest. Obvious trap is obvious.");
            System.out.print(prompt);
            playerChoice = input.nextInt();
            if (playerChoice == 1){
                System.out.println("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!");
                hasSword = true;
            }

            // Dragons Lair
            System.out.println("You leave the cavern with the chest and continue your journey");
            System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
            System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
            System.out.println("You swallow hard and decide it is time to leave.");
            System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
            System.out.println("1. Fight the Dragon.");
            System.out.println("2. Run for your life.");
            System.out.print(prompt);
            playerChoice = input.nextInt();
            if(playerChoice == 1){
                System.out.println("You feel courage surge through your body as you charge the dragon!");
                if(hasSword){
                    System.out.println("You raise the magic sword and plunge it into the dragon, slaying the beast.");
                    System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.");
                }
            } else {
                System.out.println("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!");
                System.exit(0);
            }
        } else {
            //Player runs away
            System.out.println("You have no balls and return to your bed. \nYou feel unsatisfied...");
            System.exit(0);
        }

    }
}
