package tutorial;

import java.util.Random;

public class EndlissDungon {
    public static void main(String[] args) {
        Random generator = new Random();
        int playerHealth,enemyHealth;
        playerHealth = 100;
        enemyHealth = generator.nextInt(10)+1;
        int enemysDefeated = 0;
        while(playerHealth > 0){
            if(enemyHealth <= 0){
                System.out.println("You have defeated the enemy! You kick down the door to the next room and prepare yourself to fight the next enemy.");
                enemyHealth = generator.nextInt(10) + 1;
                enemysDefeated++;
            }
            System.out.println("You have " + playerHealth + " health.");
            int playerDmg,enemyDmg;
            playerDmg = generator.nextInt(5) + 1;
            enemyDmg = generator.nextInt(3)+1;
            playerHealth -= enemyDmg;
            enemyHealth -= playerDmg;
            System.out.println("You attack the enemy for " + playerDmg);
            System.out.println("The enemy attacks you for " + enemyDmg);
        }
        System.out.println("\nYou Died.  :(\nYou killed " + enemysDefeated + " enemies!");
    }
}
