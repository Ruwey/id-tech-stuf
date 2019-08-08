package tutorial;

import java.util.Scanner;

public class CharacterCreator {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);
        String playerName;
        System.out.println("What is your name?");
        playerName=playerInput.nextLine();
        System.out.println("How much health does " + playerName + " have.");
        double playerHealth = playerInput.nextDouble();
        System.out.println("Welcome " + playerName + ". You have " + playerHealth + " health");
        playerInput.close();
    }
}