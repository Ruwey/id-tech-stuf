package tutorial;

import java.util.Random;

public class MonsterGenerator {
    public static void main(String[] args) {
        String[] monsters = {"Larry","Jarry","Barry"};
        monsters[1] = "Karry";
        Random ranGen = new Random();

        System.out.println(monsters[0]);
        System.out.println(monsters[1]);
        System.out.println(monsters[2]);
        System.out.println("There are " + monsters.length + " monsters.");
        int monsterIndex = ranGen.nextInt(monsters.length);
        System.out.println("A " + monsters[monsterIndex] + " appears.");
    }
}
