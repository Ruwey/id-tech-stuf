package tutorial;

public class DragonSlayer {
    public static void main(String[] args) {
        int playerStrength = 40;
        int dragonHp = 45;
        boolean hasSword = true;
        if (playerStrength > dragonHp) {
            System.out.println("Dragon is defeted!");
        } else if (hasSword) {
            System.out.println("Thanks to your sword, your weakness did not lead to your demise.");
        } else {
            System.out.println("The dragon defeted you!");
        }
    }
}
