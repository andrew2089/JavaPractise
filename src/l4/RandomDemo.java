package l4;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

      //  System.out.println("Random  number = " + random.nextInt(100));

        int chance = random.nextInt(100) + 1;
        System.out.println("chance = " + chance);
        if (chance >= 1 && chance <= 25) {
            System.out.println("I m going in Angola");
        }
        if (chance >= 26 && chance <= 50) {
            System.out.println("I m going to Bulgaria");
        }
        if (chance > 50 && chance <= 75) {
            System.out.println("I m going to Turkey");
        }
        if (chance > 75 && chance <= 100) {
            System.out.println("I m going do Denmark");
        }
    }
}
