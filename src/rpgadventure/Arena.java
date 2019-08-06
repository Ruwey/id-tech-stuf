package rpgadventure;

public class Arena {
    public static void main(String[] args) {
        // Player 1 Configuration
        Character player1 = new Character();
        player1.name = "Jerry";
        player1.stregth = 2;
        player1.health = 50;
        player1.defence = 3;

        // Player 2 Configuration
        Character player2 = new Character();
        player2.name = "Larry";
        player2.stregth = 6;
        player2.health = 50;
        player2.defence = 0;

        System.out.println(player1.name + " vs " + player2.name);
        System.out.println(player1.health + " vs " + player2.health);

        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(player1.name + " : " + player1.health);
            System.out.println(player2.name + " : " + player2.health);

            // Take dmg
            int dmg;
            // Player 1
            dmg = player1.attack(player2);
            System.out.println(player1.name + " attacks " + player2.name + " for " + dmg + " damage.");
            // Player 2
            dmg = player2.attack(player1);
            System.out.println(player2.name + " attacks " + player1.name + " for " + dmg + " damage.");
            System.out.print("\n");
        }
        System.out.println(player1.name + " : " + player1.health);
        System.out.println(player2.name + " : " + player2.health);
    }
}
