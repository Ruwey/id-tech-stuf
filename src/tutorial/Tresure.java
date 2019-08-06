package tutorial;

import java.util.Random;

public class Tresure {
    public static void main(String[] args) {
        Random generator = new Random();
        int gold = generator.nextInt(5);
        System.out.println(gold);

    }
}
