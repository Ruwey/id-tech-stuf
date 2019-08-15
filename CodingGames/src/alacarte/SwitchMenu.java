package alacarte;

import java.util.Scanner;

public class SwitchMenu {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class\n1: Warrior\n2: Rogue\n3: Wizard");
        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You Picked Warrior");
                break;
            case 2:
                System.out.println("You Picked Rouge");
                break;
            case 3:
                System.out.println("You're a wizard harry!");
                break;
            default:
                System.out.println("That an't no option!");
                break;
        }
    }

}