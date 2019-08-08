package tutorial;

import java.util.Scanner;

public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();
        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();
        if(playerClass == 1 && playerChoice == 1){
            System.out.println("You (an amazing fighter) smash through the guard's armour with only one strike!");
        } else if (playerClass == 2 && playerChoice == 2){
            System.out.println("The thief easily steals the guards wallet");
        } else if (playerClass == 3 && playerChoice == 3){
            System.out.println("The mage creates a giant fire ball, incinerating the guard.");
        } else if((playerClass == 2 || playerClass == 3) && playerChoice == 4){
            System.out.println("The guard is convinced to leave.");
        } else if((playerClass == 1 || playerClass == 3) && playerChoice == 5){
            System.out.println("The guard is intimidated.");
        } else if(!(playerClass == 3) && playerChoice == 6){
            System.out.println("The guard lets you through as he agrees with you hate of magic.");
        } else {
            System.out.println("The attack fails.");
        }
        userInput.close();
    }

}
